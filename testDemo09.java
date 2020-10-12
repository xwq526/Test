package com.company.Preview.day3.Test;
import java.lang.Math;
//9. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
public class testDemo09 {
    public static void main(String[] args) {
        for (int i = 0; i < 999; i++) {
            int a = i%10;
            int a1 =i/10;
            int b = a1%10;
            int b1 = a1/10;
            if (Math.pow(a,3)+Math.pow(b,3)+Math.pow(b1,3)==i){
                if (i>=100) {
                    System.out.println(i);
                }
            }
        }

    }
}
