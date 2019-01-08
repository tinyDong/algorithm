package leetCode.code150;

public class code121 {

//    动态规划 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
    public static void main(String[] args) {
        int[] nums = new int[]{7,6,4,3,1};
        int result = maxProfit(nums);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
      int[] dp = new int[prices.length];
      int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min,prices[i]);
            dp[i] = Math.max(dp[i-1],prices[i] - min);
        }
        return dp[prices.length-1];
    }
}
