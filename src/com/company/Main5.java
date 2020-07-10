package com.company;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-10
 * Time:13:22
 * 一万年太久，只争朝夕，加油
 */
class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Main5 {
    public static void main(String[] args) {
        Student s1=new Student("张三",29);
        Student s2=new Student("李四",30);
        //创建一个数组，把对象放进去
        Student[] students1=new Student[]{s1,s2};
        Student[] students2= Arrays.copyOf(students1,students1.length);
        System.out.println(Arrays.toString(students1));
        students1[0].name="王五";
        System.out.println(Arrays.toString(students1));
        System.out.println(Arrays.toString(students2));
    }
}
