package com.zzl.tree;

/**
 * @ClassName Main
 * @Description TODO
 * @Author BossZ
 * @Version 1.0
 * @Date 2019/5/16-13:29
 **/
public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(50);
        bt.insert(20);
        bt.insert(80);
        bt.insert(10);
        bt.insert(30);
        bt.insert(60);
        bt.insert(90);
        bt.insert(25);
        bt.insert(85);
        bt.insert(100);
        bt.delete(10);//删除没有子节点的节点
        bt.delete(30);//删除有一个子节点的节点
        bt.delete(80);//删除有两个子节点的节点
        System.out.println(bt.findMax().getData());
        System.out.println(bt.findMin().getData());
        System.out.println(bt.find(100).getData());
        System.out.println(bt.find(200));
    }
}
