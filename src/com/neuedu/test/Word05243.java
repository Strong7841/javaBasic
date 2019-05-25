package com.neuedu.test;

public class Word05243 {
    public static void main(String[] args) {
    int[] i={1,2,3,4};
    int j=0;

        for (int a = 0;a<i.length;a++){
            for (int b = 0;b<i.length;b++){
                for (int c = 0;c<i.length;c++){
                    if (i[a]!=i[b]&&i[a]!=i[c]&&i[b]!=i[c]){
                        System.out.println(i[a]*100+i[b]*10+i[c]);
                        j++;
                    }
                }
            }
        }
        System.out.println("一共有"+j+"种");


    }
}
