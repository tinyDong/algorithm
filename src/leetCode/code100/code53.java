package leetCode.code100;

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
//示例:
//
//输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
public class code53 {

    public static void main(String[] args) {
        int[] nums =new int[]{-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray1(nums));
    }
//    public static int maxSubArray(int[] nums) {
//        int max = 0;
//        int cur = 0;
//        for (int i = 0; i < nums.length; i++) {
//            cur = cur + nums[i];
//            if (cur<0){
//                cur =0;
//            }
//            if (cur>max){
//                max = cur;
//            }
//
//        }
//        return max;
//    }

        public static int maxSubArray1(int[] nums) {
            if (nums.length == 0) return 0;
            return helper(nums, 0, nums.length - 1);
        }
        public static int helper(int[] nums, int left, int right) {
            if (left >= right) return nums[left];
            int mid = left + (right - left) / 2;
            int lmax = helper(nums, left, mid - 1);
            int rmax = helper(nums, mid + 1, right);
            int mmax = nums[mid], t = mmax;
            for (int i = mid - 1; i >= left; --i) {
                t += nums[i];
                mmax = Math.max(mmax, t);
            }
            t = mmax;
            for (int i = mid + 1; i <= right; ++i) {
                t += nums[i];
                mmax = Math.max(mmax, t);
            }
            return Math.max(mmax, Math.max(lmax, rmax));
        }
}
