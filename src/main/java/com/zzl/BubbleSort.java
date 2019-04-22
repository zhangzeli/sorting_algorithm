package com.zzl;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @Author zhangzeli
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

    /**
     * 设置一个标志，如果这一趟发生了交换，则为true，否则为false。明显如果有一趟没有发生交换，说明排序已经完成。
     *
     * @param a
     * @param n
     */
    public static void bubbleSort2(int[] a, int n) {
        int j, k = n;
        boolean flag = true;//发生了交换就为true, 没发生就为false，第一次判断时必须标志位true。
        while (flag) {
            flag = false;//每次开始排序前，都设置flag为未排序过
            for (j = 1; j < k; j++) {
                if (a[j - 1] > a[j]) {//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;

                    //表示交换过数据;
                    flag = true;
                }
            }
            k--;//减小一次排序的尾边界
        }//end while
    }//end

    /**
     * 再进一步做优化。比如，现在有一个包含1000个数的数组，仅前面100个无序，后面900个都已排好序且都大于前面100个数字，那么在第一趟遍历后，
     * 最后发生交换的位置必定小于100，且这个位置之后的数据必定已经有序了，也就是这个位置以后的数据不需要再排序了，于是记录下这位置，第二次只要从数组头部遍历到这个位置就可以了。
     * 如果是对于上面的冒泡排序算法2来说，虽然也只排序100次，但是前面的100次排序每次都要对后面的900个数据进行比较，而对于现在的排序算法3，只需要有一次比较后面的900个数据，
     * 之后就会设置尾边界，保证后面的900个数据不再被排序。
     *
     * @param a
     * @param n
     */
    public static void bubbleSort3(int[] a, int n) {
        int j, k;
        int flag = n;//flag来记录最后交换的位置，也就是排序的尾边界

        while (flag > 0) {//排序未结束标志
            k = flag; //k 来记录遍历的尾边界
            flag = 0;

            for (j = 1; j < k; j++) {
                if (a[j - 1] > a[j]) {//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;

                    //表示交换过数据;
                    flag = j;//记录最新的尾边界.
                }
            }
        }
    }

    private static void sort() {
        int[] arr = {6, 3, 8, 2, 9, 1};
        System.out.println("排序前数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < arr.length - 1 - i; j++) {//内层循环控制每一趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
