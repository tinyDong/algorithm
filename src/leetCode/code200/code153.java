package leetCode.code200;

public class code153 {

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }


    public static int findMin(int[] nums) {
        if (nums == null || nums.length==0){
            return 0;
        }
        int left = 0, right = nums.length-1;
        while (left<right){
            int mid = left + (right-left)/2;
            if (nums[mid] >nums[right]){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return nums[left];
    }

}
