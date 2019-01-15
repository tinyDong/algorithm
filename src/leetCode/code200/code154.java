package leetCode.code200;

public class code154 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5};
        System.out.println(findMin(nums));
    }


    public static int findMin(int[] nums) {
        int res = 0;
        if (nums == null || nums.length==0){
            return 0;
        }
        int left = 0, right = nums.length-1;
        while (left<right-1){
            int mid = left + (right-left)/2;
            if (nums[mid] >nums[right]){
                res = Math.min(res, nums[left]);
                left = mid+1;
            }else if (nums[left] > nums[mid]){
                res = Math.min(res, nums[mid]);
                right = mid;
            }else {
                left++;
            }
        }
        res = Math.min(res, nums[left]);
        res = Math.min(res, nums[right]);
        return res;
    }
}
