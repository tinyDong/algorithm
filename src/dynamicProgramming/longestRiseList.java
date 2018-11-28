package dynamicProgramming;

import java.util.Arrays;

//最长递增子序列 2, 11, 4, 12, 6, 1
public class longestRiseList {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 11, 4, 12, 6, 1,7};

        getLongestList1(arr);
    }

    private static void getLongestList1(int[] arr) {
        int maxLength = 1;
        int[] dp = new int[arr.length];
        Arrays.fill(dp,1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <i ; j++) {
                if (arr[j]<arr[i]&&dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                    maxLength= Math.max(maxLength,dp[i]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
    }
    
}
