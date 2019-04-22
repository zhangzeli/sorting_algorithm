package com.zzl;

/**
 * @ClassName SelectionSort
 * @Description 选择排序
 * @Author BossZ
 * @Version 1.0
 * @Date 2019/4/22-10:57
 **/
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};

        int[] sort = sort(arr);

        SortUtil.print(arr);
    }


    public static int [] sort (int [] arr){
        int minPos;
        for (int i = 0; i < arr.length - 1; i++) {

            minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) minPos = j;
            }

            SortUtil.swap(arr,i,minPos);

        }

//        SortUtil.print(arr);

        return  arr;
    }
}
