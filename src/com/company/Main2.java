package com.company;

import java.util.Scanner;

import static java.lang.Math.acos;
import static java.lang.Math.sqrt;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-10
 * Time:10:51
 * 一万年太久，只争朝夕，加油
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int x0=sc.nextInt();
            int y0=sc.nextInt();
            int z0=sc.nextInt();
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int z1=sc.nextInt();
            //先求半径
            double PI=acos(-1);
            double r=sqrt(Math.pow((x1-x0),2)+Math.pow((y1-y0),2)+Math.pow((z1-z0),2));
            double v=4.0/3*PI*Math.pow(r,3);
            System.out.printf("%.3f %.3f",r,v);
        }

    }
}
