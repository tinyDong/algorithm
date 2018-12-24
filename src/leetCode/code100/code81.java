package leetCode.code100;

public class code81 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(nums,target));
    }

    public static boolean search(int[] nums, int target) {

        int left = 0 , right = nums.length;
        while (left<right){
            int mid = left + (right - left)/2;
            if (target == nums[mid]){
                return true;
            }else if (target > nums[mid]){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return false;
    }
}
