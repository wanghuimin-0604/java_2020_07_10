package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNextLine()){
	    String str1=sc.nextLine();
	    String str2=sc.nextLine();
	    //输入两个字符串
        //把他们都变成大写
        String str3=str1.toUpperCase();
        String str4=str2.toUpperCase();
        int i=0;
        int j=0;
        List<Character> list=new ArrayList<>();
        for(i=0;i<str3.length();i++) {
            for (j = 0; j < str4.length(); j++) {
                if (str3.charAt(i) == str4.charAt(j)) {
                    //有的话直接跳出循环
                    break;
                }
            }
            if (j == str4.length()&&(!list.contains(str3.charAt(i)))) {
                //遍历完之后没有的话就放进set集合中

                list.add(str3.charAt(i));
            }
        }
        for(Character a:list){
            System.out.print(a);
        }
    }



    }
}
