package com.zzl;

/**
 * @ClassName QuickSort
 * @Description 快速排序
 * @Author BossZ
 * @Version 1.0
 * @Date 2019/5/17-11:00
 **/
public class QuickSort {

    public static void main(String[] args) {
        int [] arr = {7,3,2,10,8,1,9,5,4,6};
//        int [] arr = {4,6};
        sort(arr,0,arr.length-1);
        SortUtil.print(arr);
    }

    public static void sort(int [] arr,int leftBound ,int rightBound){
        if(leftBound >= rightBound) return;
        int  mid  = partition(arr,leftBound,rightBound);
        sort(arr,leftBound,mid-1);
        sort(arr,mid+1,rightBound);
    }

    private static int partition(int[] arr, int leftBound, int rightBound) {
        int pivot = arr[rightBound];
        int left =leftBound;
        int right =rightBound-1;
        while (left <= right){
            while (left <= right && arr[left] <= pivot) left ++;
            while (left <= right && arr[right] > pivot) right --;
            if(left <right) SortUtil.swapBit(arr,left,right);
//            SortUtil.print(arr);
//            System.out.println();
        }
//        if(pivot<arr[left]){
            SortUtil.swapBit(arr,left,rightBound);
//        }
        return left;
    }
}
