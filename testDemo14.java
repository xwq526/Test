package com.company.Preview.day3.Test;
import java.util.Random;
import java.util.Scanner;
//14. 完成猜数字游戏
public class testDemo14 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc= new Scanner(System.in);
        int toGuess = random.nextInt(100);
        while (true){
            System.out.println("请输入一个整数：");
            int num=sc.nextInt();
            if (num < toGuess) {
                System.out.println("太低了");
            } else if (num > toGuess) {
                System.out.println("太高了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
        sc.close();
    }
}
