package jianzhioffer;


import java.util.Arrays;

public class code10 {

    public static void main(String[] args) {

        System.out.println("====");

        System.out.println(jumpMax(3));

    }

//    青蛙一次可以跳上 1 级台阶，也可以跳上 2 级... 它也可以跳上 n 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
    private static int jumpMax(int target){
            int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++){
            for (int j = 0; j < i; j++) {
                dp[i] = dp[i] + dp[j];
            }
        }
        return dp[target-1];
    }


    //求斐波那契数列的第 n 项
    private static  int getResult(int n ){
        if (n <= 1)
            return n;
        int pre2 = 0, pre1 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }

//    //一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
//    private static int jump(int n){
//
//        int f1 = 1;
//        int f2 = 2;
//        int result=0;
//        for (int i = 3; i <=n ; i++) {
//            result = f1+f2;
//            f1 = f2;
//            f2 = result;
//
//        }
//        return result;
//    }
//
//    //我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。请问用 n 个 2*1 的小矩形无重叠地覆盖一个 2*n 的大矩形，总共有多少种方法？
//    private static int getMax(int i) {
//
//        int f1 = 1;
//        int f2 = 2;
//        int result = 0;
//        for (int j = 3; j <=i ; j++) {
//            result = f1+f2;
//            f1 = f2;
//            f2 =result;
//        }
//        return result;
//    }
}
