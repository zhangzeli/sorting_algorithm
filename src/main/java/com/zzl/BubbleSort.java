package com.zzl;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author BossZ
 * @Version 1.0
 * @Date 2019/4/22-14:04
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 8, 9, 4, 7, 6};
        sort(arr);
    }

    public static void sort(int[] a) {

        for (int n = a.length - 1; n > 0; n--) {

            for (int i = 0; i < n; i++) {
                if (a[i] > a[i + 1]) SortUtil.swap(a, i, i + 1);
            }

        }

//        SortUtil.print(a);
    }
}
