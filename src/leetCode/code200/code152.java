package leetCode.code200;

public class code152 {

//    示例 1:
//
//    输入: [2,3,-2,4]
//    输出: 6
//    解释: 子数组 [2,3] 有最大乘积 6。
    //max =Math.max(n*f(n-1),)

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int n = nums.length , res = nums[0];
        int[] maxDp = new int[n];
        int[] minDp = new int[n];
        maxDp[0] = nums[0];
        minDp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxDp[i] = Math.max(Math.max(nums[i]*maxDp[i-1],nums[i]*minDp[i-1]),nums[i]);
            minDp[i] = Math.min(Math.min(nums[i]*maxDp[i-1],nums[i]*minDp[i-1]),nums[i]);
            res =Math.max(res,maxDp[i]);
        }
        return res;
    }
}
