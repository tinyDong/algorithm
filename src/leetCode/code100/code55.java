package leetCode.code100;
//示例 1:
//
//输入: [2,3,1,1,4]
//输出: true
//解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
//示例 2:
//
//输入: [3,2,1,0,4]
//输出: false
//解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
public class code55 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        System.out.println(canJump(nums));
    }

    private static boolean canJump(int[] nums) {
        int[] dp =new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1],nums[i-1])-1;
            if (dp[i]<0){
                return false;
            }

        }
        return dp[nums.length-1]>=0;
    }

    //贪心
    private static boolean canJump1(int[] nums) {
        int reach=0;
        for (int i = 0; i < nums.length; i++) {
            if (i>reach||reach >= nums.length-1){
                break;
            }
            reach = Math.max(reach,i+nums[i]);
        }
        return reach>nums.length-1;
    }

}
