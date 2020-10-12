package com.company.Preview.day3.Test;
//4. 输出 1000 - 2000 之间所有的闰年
public class testDemo04 {
    public static void main(String[] args) {
        for (int year= 1000; year <=2000 ; year++) {
            if (year%4==0 && year%100!=0 || year%400==0){
                System.out.println(year);
            }
        }
    }
}
