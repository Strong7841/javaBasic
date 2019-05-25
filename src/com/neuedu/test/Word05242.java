package com.neuedu.test;

import java.util.Scanner;

public class Word05242 {
    public static void main(String[] args) {

        System.out.println("请输入成绩：");
        Scanner input =new Scanner(System.in);
       int a =input.nextInt();


           if (a>= 90) {
               System.out.println("A");


           }else  if (a>=60&&a<90){
               System.out.println("B");

           }else  {
               System.out.println("C");

       }

    }
}
