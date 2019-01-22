package leetCode.code250;


//示例:
//
//输入: s = 7, nums = [2,3,1,2,4,3]
//输出: 2
//解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
public class code209 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(minSubArrayLen(15,nums));
    }


    public static int minSubArrayLen(int target, int[] nums) {
        int left =0 ,right =0, res = nums.length+1,sum=0,n = nums.length;

        while (right<n){

            while (right < n && sum<target){
                sum = sum + nums[right];
                right++;
            }

            while (sum>=target){
                res = Math.min(res,right - left);
                sum = sum - nums[left];
                left++;
            }
        }
        return res == n+1?0:res;
    }
}
