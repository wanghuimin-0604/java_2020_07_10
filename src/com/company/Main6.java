package com.company;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-10
 * Time:13:31
 * 一万年太久，只争朝夕，加油
 */
class Students implements Cloneable{
    public String name;
    public int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Students clone() throws CloneNotSupportedException {
        return (Students)super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Main6 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Students s1=new Students("张三",29);
        Students s2= s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        s1.name="王五";
        System.out.println(s1);
        System.out.println(s2);
    }
}
