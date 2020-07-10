package com.company;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-10
 * Time:11:49
 * 一万年太久，只争朝夕，加油
 */
//递归方法求汉诺塔问题
public class Main3 {
    //全局变量m来记录移动的次数
    static int m=0;

    public static void move(int disks,char M,char N){
        System.out.println("第"+(++m)+"次移动，把"+disks+"号盘子从"+M+"上移动到了"+N+"上");
    }

    public static void hanio(int n,char A,char B,char C){
        if(n==1){
            //只有一个盘子的时候，直接把盘子从A移动到C，不需要辅助
            move(1,A,C);
        }else{
            //不是一个盘子
            //先把n-1个盘子从A借助C移动到B上
            hanio(n-1,A,C,B);
            move(n,A,C);
            hanio(n-1,B,A,C);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char A='A';
        char B='B';
        char C='C';
        //输入圆盘个数
        int n=sc.nextInt();
        //静态方法，直接通过类名来调用
        Main3.hanio(n,A,B,C);
        System.out.println("移动了"+m+"次，把圆盘从A都移动到了C上");


    }
}
