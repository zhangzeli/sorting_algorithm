package com.zzl;

/**
 * @ClassName InsertionSort
 * @Description 插入排序
 * @Author zhangzeli
 * @Version 1.0
 * @Date 2019/4/22-15:20
 **/
public class InsertionSort {

    public static void main(String[] args) {
        int [] a={9,4,5,3,2,1,6,8,7};
        sort(a);
        SortUtil.print(a);
    }

    public static void sort(int [] a){
        for(int i = 1;i<a.length;i++){
            for(int j =i;j>0;j--){
                if(a[j]<a[j-1]){
                    SortUtil.swapBit(a,j,j-1);
                }
            }
        }
    }

    public static void InsertSort(int[] arr)
    {
        int i, j;
        int n = arr.length;
        int target;

        //假定第一个元素被放到了正确的位置上
        //这样，仅需遍历1 - n-1
        for (i = 1; i < n; i++)
        {
            j = i;
            target = arr[i];

            while (j > 0 && target < arr[j - 1])
            {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = target;
        }
    }
}
