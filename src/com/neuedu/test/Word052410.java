package com.neuedu.test;

import java.util.Scanner;

public class Word052410 {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b=a/100;
        int c=a%100/10;
        int d=a%10;
        if ((b+c+d)%9==0){
            System.out.println(a+"是9的倍数");
        }else System.out.println(a+"不是9的倍数");

    }
}
