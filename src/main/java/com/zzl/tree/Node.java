package com.zzl.tree;

/**
 * @ClassName Node
 * @Description 节点
 * @Author zhangzeli
 * @Version 1.0
 * @Date 2019/5/16-11:23
 **/
public class Node<T extends Comparable> {
    private T data ;//节点数据
    private Node leftChild;//左子节点的引用
    private Node rightChild;//右子节点的引用

    public Node(T data) {
        this.data = data;
    }

    public Node() {
    }

    //打印节点内容
    public void display(){
        System.out.println(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
