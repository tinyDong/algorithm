package leetCode.code250;

public class code213 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};

        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }else {
            int result1 = helper(nums,0,nums.length-2);
            int result2 = helper(nums,1,nums.length-1);
            return Math.max(result1,result2);
        }
    }

    private static int helper(int[] nums , int start , int end){
        int n = end -start+1;
        int[] dp = new int[n];
        dp[0] =nums[start];
        dp[1] =Math.max(nums[start],nums[start+1]);
        for (int i =2; i < n; i++) {
            dp[i] = Math.max(nums[i+start]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}
