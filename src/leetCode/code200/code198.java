package leetCode.code200;

//示例 2:
//输入: [2,7,9,3,1]
//输出: 12
//解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
//偷窃到的最高金额 = 2 + 9 + 1 = 12
public class code198 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {


//        if (num.size() <= 1) return num.empty() ? 0 : num[0];
//        vector<int> dp = {num[0], max(num[0], num[1])};
//        for (int i = 2; i < num.size(); ++i) {
//            dp.push_back(max(num[i] + dp[i - 2], dp[i - 1]));
//        }
//        return dp.back();
//    }
        if (nums.length<= 1){
            return nums.length==0 ? 0 : nums[0];
        }
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
