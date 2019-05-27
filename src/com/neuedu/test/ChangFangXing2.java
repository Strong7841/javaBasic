package com.neuedu.test;

public class ChangFangXing2 {
    public static void main(String[] args) {
//        长方形无参
        System.out.println("无参的长方形");
        ChangFangXing1 wucan=new ChangFangXing1();
        wucan.cfx1();
        //长方形一个参数
        System.out.println("一个参的长方形");
        ChangFangXing1   yigecanshu=new ChangFangXing1();
        yigecanshu.cfx2(4);
//长方形俩个参数
        System.out.println("俩个参的长方形");
        ChangFangXing1   liagecanshu=new ChangFangXing1();
        liagecanshu.cfx3(5,6);

    }
}
