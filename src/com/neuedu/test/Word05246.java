package com.neuedu.test;

import java.util.Scanner;

public class Word05246 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=a/10000;
        int c=a/1000%10;
        int d=a/100%10;
        int e=a%100/10;
        int f=a%10;
        if (b==f&&c==e){
            System.out.println(a+"是一个回文数");
        }else
            System.out.println(a+"不是一个回文数");



    }
}
