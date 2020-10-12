package com.company.Preview.day3.Test;
import java.util.Scanner;
//2. 判定一个数字是否是素数
public class testDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag=true;
        if (num<2){
            flag=false;
        }else {
            for (int i = 2; i < num; i++) {
                if (num%i==0){
                    flag=false;
                }
            }
        }
        if (flag){
            System.out.println(num+"是素数");
        }else{
            System.out.println(num+"不是素数");
        }
        sc.close();
    }
}
