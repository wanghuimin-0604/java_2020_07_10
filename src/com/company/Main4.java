package com.company;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-10
 * Time:12:21
 * 一万年太久，只争朝夕，加油
 */
//复制数组
public class Main4 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3};
        show01(arr);
        show02(arr);
        show03(arr);
        show04(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void show04(int[] arr) {
        int[] newarr=arr.clone();

        //System.out.println(Arrays.toString(arr));

    }

    private static void show03(int[] arr) {
        int[] newarr= Arrays.copyOf(arr,arr.length);
        newarr[0]=9;
        //System.out.println(Arrays.toString(arr));
    }

    private static void show02(int[] arr) {
        int[] newarr=new int[arr.length];
        System.arraycopy(arr,0,newarr,0,arr.length);
        //System.out.println(Arrays.toString(arr));


    }

    //for循环进行复制
    private static void show01(int[] arr) {
        int[] newarr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        //System.out.println(Arrays.toString(arr));
    }
}
