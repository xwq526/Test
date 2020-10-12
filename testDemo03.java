package com.company.Preview.day3.Test;
//打印 1 - 100 之间所有的素数
public class testDemo03 {
    public static void main(String[] args) {
        int num=1;
        while (num<=100){
            boolean flag =true;
            if (num<2){
                flag=false;
            }else {
                for (int i = 2; i <num; i++) {
                    if (num%i==0){
                        flag=false;
                    }
                }
            }
            if (flag){
                System.out.println(num);
            }
            num++;
        }

    }
}


