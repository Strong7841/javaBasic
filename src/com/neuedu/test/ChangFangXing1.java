package com.neuedu.test;

public class ChangFangXing1 {
//无参
    public void cfx1(){
        int width=1;
        int height=1;
        System.out.println("周长为："+(width+height)*2);
        System.out.println("面积为:"+width*height);
    }
//1个参数
    public void cfx2(int a){
        int  width=a;
        int  height=a;
        System.out.println("周长为："+(width+height)*2);
        System.out.println("面积为："+width*height);
    }
    //2个参数
    public  void    cfx3(int  b,int   c){
        int  width=b;
        int  height=c;
        System.out.println("周长为："+(width+height)*2);
        System.out.println("面积为："+width*height);
    }

}
