package jianzhioffer;

public class code8 {
    public static void main(String[] args) {
        System.out.println(JumpFloor1(4));
        System.out.println(JumpFloor(4));
    }



    public static int JumpFloor1(int target) {
        int[] dp = new int[target+1];
        dp[1] =1;
        dp[2] =2;
        for (int i = 3; i <= target; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[target];
    }

    public static int JumpFloor(int target) {

        int res = 0;
        int a = 1;
        int b = 2;
        for (int i = 3; i <=target ; i++) {
            res = a + b;
            a = b;
            b =res;
        }
        return res;
    }
}
