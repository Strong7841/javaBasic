package com.neuedu.test;

import java.util.Scanner;

public class Word05247 {
    public static void main(String[] args) {


     System.out.println("请输入一个年份：");
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();

    if (a%4==0&&a%100!=0||a%400==0){
        System.out.println(a+"是闰年");
    }else
        System.out.println(a+"是平年");


    }
}
