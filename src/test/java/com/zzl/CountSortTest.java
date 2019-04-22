package com.zzl;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @ClassName CountSortTest
 * @Description 测试
 * @Author zhangzeli
 * @Version 1.0
 * @Date 2019/4/19-11:14
 **/
public class CountSortTest {

    int [] generateRandomArray(){
        Random r = new Random();
        int [] arr = new int[10000];
        for (int i=0;i<arr.length;i++){
            arr[i] = r.nextInt(10);
        }
        return arr;
    }

    @Test
    void testSort(){
        int [] a = generateRandomArray();
        int [] result = CountSort.sort(a);
        Arrays.sort(a);
        boolean same  =true;
        for(int i =0;i<a.length;i++){
            if(result[i]!=a[i]) same =false;
        }
        assertEquals(true,same);
    }
}
