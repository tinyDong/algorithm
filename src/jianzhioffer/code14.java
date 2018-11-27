package jianzhioffer;

//把一根绳子剪成多段，并且使得每段的长度乘积最大。
//n = 2
//return 1 (2 = 1 + 1)
//
//n = 3  return 2*2
//n = 10
//return 36 (10 = 3 + 3 + 4)
//f(n)=max{f(i)*f(n-i)}
public class code14 {

    public static void main(String[] args) {

        int result = getMax(10);
        System.out.println(result);
    }

    private static int getMax(int length) {
        if (length < 2) return 0;
        if (length == 2) return 1;
        if (length == 3) return 2;

        int[] dp = new int[length+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;

        int max =0;

        for (int i = 4; i <= length; i++) {
            for (int j = 1; j <= i/2; j++) {
                int temp = dp[j]*dp[i-j];
                max = Math.max(max,temp);
                dp[i]=max;
            }
        }
        max = dp[length];
        return max;
    }
}
