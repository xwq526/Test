package com.company.Preview.day3.Test;
//编写程序数一下 1到 100 的所有整数中出现多少个数字9。
public class testDemo08 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <101 ; i++) {
            if (i%10==9){
                sum++;
            }
        }
        System.out.println(sum);

    }
}
