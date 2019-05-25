package com.neuedu.test;

public class Word05245 {
    public static void main(String[] args) {
          int sum=0;
        for (int i=1;i<=100;i++){
            if (i%2==0){
                sum=sum+i;
            }

        }
        System.out.println("1到100的偶数和为"+sum);

        int sun=0;
        for (int b=1;b<=100;b++){
            if (b%2==1){
                sun=sun+b;
            }
        }
        System.out.println("1到100的奇数和为"+sun);
    }
}
