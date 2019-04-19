package com.zzl;

import java.util.Arrays;

/**
 * @ClassName CountSort
 * @Description 计数排序，桶排序的一种
 * @Author BossZ
 * @Version 1.0
 * @Date 2019/4/18-17:19
 **/
public class CountSort {


    public static void main(String[] args) {
        int [] arr={2,4,2,3,7,1,1,0,0,5,6,9,8,5,7,4,0,9};

        int [] result = sort(arr);

        System.out.println(Arrays.toString(result));
    }

    /**
     * 此版本有两个问题，
     * 第一如果取范围值，会出现数组空间浪费
     * 第二 稳定性
     *
     * @param arr
     * @return
     */
    public static int [] sort(int[] arr) {
        int [] result = new int[arr.length];

        int [] count = new int[10];

        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }

        System.out.println(Arrays.toString(count));

        for(int i =0 ,j=0; i<count.length;i++){
            while (count[i]-- >0) result[j++]=i;
        }
        return result;
    }
}
