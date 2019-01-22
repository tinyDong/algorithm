package leetCode.code250;


//示例:
//
//输入: s = 7, nums = [2,3,1,2,4,3]
//输出: 2
//解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
public class code209 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(minSubArrayLen1(15,nums));
    }


//    public static int minSubArrayLen2(int target, int[] nums) {
//        int len = nums.length, res = len + 1 ;
//        int[] sums = new int[len + 1];
//        for (int i = 1; i < len + 1; ++i){
//            sums[i] = sums[i - 1] + nums[i - 1];
//        }
//        for (int i = 0; i < len + 1; ++i) {
//
//            int right = searchRight(i + 1, len, sums[i] + target, sums);
//
//            if (right == len + 1){
//                break;
//            }
//            if (res > right - i){
//                res = right - i;
//            }
//        }
//        return res == len + 1 ? 0 : res;
//    }
//
//    private static int searchRight(int left, int right, int key, int sums[]) {
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (sums[mid] >= key){
//                right = mid - 1;
//            } else{
//                left = mid + 1;
//            }
//        }
//        return left;
//    }



    public static int minSubArrayLen1(int target, int[] nums) {
        int left =0 , n = nums.length , res = n+1,sum =0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            while (left<=i && sum>=target){
                res = Math.min(res,i - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        return res==n+1?0:res;
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
