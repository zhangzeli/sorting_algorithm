package com.zzl;

/**
 * @ClassName Util
 * @Description 数组交换，数值打印
 * @Author BossZ
 * @Version 1.0
 * @Date 2019/4/22-11:30
 **/
public class SortUtil {

   public static void swap(int [] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapBit(int [] arr,int i ,int j){
       if(i==j)return;
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }


    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr ={10,6,3,10};
        swapBit(arr,0,0);
        print(arr);
   }
}
