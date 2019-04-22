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


    public static  void sort(){
        int[] arr={1,3,2,45,65,33,12};
        System.out.println("交换之前：");
        for(int num:arr){
            System.out.print(num+" ");
        }
        //选择排序的优化
        for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
            int k = i;
            for(int j = k + 1; j < arr.length; j++){// 选最小的记录
                if(arr[j] < arr[k]){
                    k = j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if(i != k){  //交换a[i]和a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.println();
        System.out.println("交换后：");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
