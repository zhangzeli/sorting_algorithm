package com.zzl.tree;

import java.awt.event.KeyEvent;

/**
 * @ClassName BinaryTree
 * @Description 二叉树
 * @Author BossZ
 * @Version 1.0
 * @Date 2019/5/16-11:39
 **/
public class BinaryTree implements Tree{

    //根节点
    private Node root;

    /**
     *    查找某个节点，我们必须从根节点开始遍历。
     * 　　①、查找值比当前节点值大，则搜索右子树；
     * 　　②、查找值等于当前节点值，停止搜索（终止条件）；
     * 　　③、查找值小于当前节点值，则搜索左子树；
     * 　　树的效率：查找节点的时间取决于这个节点所在的层数，每一层最多有2n-1个节点，总共N层共有2n-1个节点，那么时间复杂度为O(logn),底数为2。
     * @param data
     * @return
     */
    @Override
    public Node find(Comparable data) {
        Node current =root;
        while (current!=null){
            if(current.getData().compareTo(data)>0){
                current = current.getLeftChild();
            }else if(current.getData().compareTo(data)<0){
                current = current.getRightChild();
            }else {
                return current;
            }
        }
        return null;
    }

    /**
     *  要插入节点，必须先找到插入的位置。
     *  与查找操作相似，由于二叉搜索树的特殊性，
     *  待插入的节点也需要从根节点开始进行比较，
     *  小于根节点则与根节点左子树比较，反之则与右子树比较，
     *  直到左子树为空或右子树为空，
     *  则插入到相应为空的位置，
     *  在比较的过程中要注意保存父节点的信息 及 待插入的位置是父节点的左子树还是右子树，才能插入到正确的位置。
     * @param data
     * @return
     */
    @Override
    public boolean insert(Comparable data) {
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return true;
        }else{
            Node current = root;
            Node parentNode = null;
            while (current!=null){
                parentNode = current;
                //当前值比插入值大，搜索左子节点
                if(current.getData().compareTo(data)>0){
                    current = current.getLeftChild();
                    if(current == null){
                        //左子节点为空，直接将新值插入到该节点
                        parentNode.setLeftChild(newNode);
                        return true;
                    }
                }else{
                    current = current.getRightChild();
                    if(current ==null ){////右子节点为空，直接将新值插入到该节点
                        parentNode.setRightChild(newNode);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    //中序遍历
    public void infixOrder(Node current){
        if(current != null){
            infixOrder(current.getLeftChild());
            System.out.print(current.getData()+" ");
            infixOrder(current.getRightChild());
        }
    }

    //前序遍历
    public void preOrder(Node current){
        if(current != null){
            System.out.print(current.getData()+" ");
            preOrder(current.getLeftChild());
            preOrder(current.getRightChild());
        }
    }

    //后序遍历
    public void postOrder(Node current){
        if(current != null){
            postOrder(current.getLeftChild());
            postOrder(current.getRightChild());
            System.out.print(current.getData()+" ");
        }
    }

    //找到最大值
    public Node findMax(){
        Node current = root;
        Node maxNode = current;
        while(current != null){
            maxNode = current;
            current = current.getRightChild();
        }
        return maxNode;
    }
    //找到最小值
    public Node findMin(){
        Node current = root;
        Node minNode = current;
        while(current != null){
            minNode = current;
            current = current.getLeftChild();
        }
        return minNode;
    }


    /**
     * 删除节点是二叉搜索树中最复杂的操作，删除的节点有三种情况，前两种比较简单，但是第三种却很复杂。
     *
     * 　　1、该节点是叶节点（没有子节点）
     *
     * 　　2、该节点有一个子节点
     *
     * 　　3、该节点有两个子节点
     *
     * 　　下面我们分别对这三种情况进行讲解。
     * @param data
     * @return
     */
    @Override
    public boolean delete(Comparable data) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild =false;
        while (current.getData().compareTo(data)!=0){
            parent = current;
            if(current.getData().compareTo(data)>0){
                isLeftChild = true;
                current = current.getLeftChild();
            }else{
                isLeftChild = false;
                current = current.getRightChild();
            }
            if (current == null){
                return false;
            }
        }
        // 如果当前节点没有子节点
        if(current.getLeftChild()==null&&current.getRightChild()==null){
            if(current ==root){
                root =null;
            }else if(isLeftChild) {
                parent.setLeftChild(null);
            }else {
                parent.setRightChild(null);
            }
            return true;
        } else if(current.getLeftChild()==null&&current.getRightChild()!=null){
            if(current == root){
                root = current.getRightChild();
            }else if(isLeftChild){
                parent.setLeftChild(current.getRightChild());
            }else{
                parent.setRightChild(current.getRightChild());
            }
            return true;
        }else if(current.getLeftChild() != null && current.getRightChild() == null){
            if(current == root){
                root = current.getLeftChild();
            }else if(isLeftChild){
                parent.setLeftChild(current.getLeftChild());
            }else{
                parent.setRightChild(current.getRightChild());
            }
            return true;
        }else{
            //当前节点存在两个子节点
            Node successor = getSuccessor(current);
            if(current == root){
                root= successor;
            }else if(isLeftChild){
                parent.setLeftChild(successor);
            }else{
                parent.setRightChild(successor);
            }
            successor.setLeftChild(current.getLeftChild());
        }

        return false;
    }
    public Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.getRightChild();
        while(current != null){
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }
        //后继节点不是删除节点的右子节点，将后继节点替换删除节点
        if(successor != delNode.getRightChild()){
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(delNode.getRightChild());
        }
        return successor;
    }
}
