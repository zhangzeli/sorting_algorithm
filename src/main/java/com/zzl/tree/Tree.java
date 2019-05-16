package com.zzl.tree;

/**
 * 　　二叉树的具体方法
 */
public interface Tree<T extends Comparable> {
    //查找节点
    Node find(T key);

    //插入节点
    boolean insert(T key);


    //删除节点
     boolean delete(T key);

    //中序遍历
    public void infixOrder(Node current);
    //前序遍历
    public void preOrder(Node current);
    //后序遍历
    public void postOrder(Node current);

    //查找最大值
    public Node findMax();
    //查找最小值
    public Node findMin();

}
