package Day20201014;
//青蛙跳台阶问题
// 一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法
public class TestDemo07 {
    public static void main(String[] args) {
        int n =10;
        System.out.println(addSum(n));
        System.out.println(addSumN(n));
    }
    public static int addSum(int n){
        if (n==1){
           return 1;
        }
        if (n==2){
            return 2;
        }
        return addSum(n-1)+addSum(n-2);//类似斐波那契
    }
    public static int addSumN(int n){//可以跳n级
        if (n==1){
            return 1;
        }
        return 2*addSumN(n-1);
    }
}

