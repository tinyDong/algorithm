package jianzhioffer;

//一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
public class code11 {

    public static void main(String[] args) {
        System.out.println(jump(4));
    }

    private static int jump(int n){

        int f1 = 1;
        int f2 = 2;
        int result=0;
        for (int i = 3; i <=n ; i++) {
            result = f1+f2;
            f1 = f2;
            f2 = result;

        }
        return result;
    }
}
