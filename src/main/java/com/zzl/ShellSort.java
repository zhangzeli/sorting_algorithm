package com.zzl;

/**
 * @ClassName ShellSort
 * @Description 希尔排序
 * @Author zhangzeli
 * @Version 1.0
 * @Date 2019/4/23-10:05
 **/
public class ShellSort {

    public static void main(String[] args) {
        int [] arr = {2,1,6,3,4,8,5,9,0};
        sort(arr);
        SortUtil.print(arr);
    }

    public static void sort(int [] a){

        int h = 1;

        while (h<=a.length/3){
            h = h*3+1;
        }

        int increment = h;
        int i, j;
        int n = a.length;
        int target;
        while (increment>=1) {
            for (i = increment; i < n; i++) {
                j = i;
                target = a[i];
                while (j >= increment && target < a[j - increment]) {
                    SortUtil.swap(a, j, j - increment);
                    j -= increment;
                }
                a[j] = target;
            }
            increment = (increment-1)/3;
        }

    }
}
