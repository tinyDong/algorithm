package leetCode;


//假设按照升序排序的数组在预先未知的某个点上进行了旋转。
//( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
public class code33 {

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {

       int left = 0;
       int right = nums.length-1;
       while (left<=right){
           int mid = left + (right-left)/2;
           if (nums[mid] == target){
               return mid;
           }else if (nums[mid]<nums[right]){
               if (target > nums[mid]&& target<=nums[right]){
                   left = mid + 1;
               }else {
                   right = mid-1;
               }
           }else {
               if (target<nums[mid]&&target>=nums[left]){
                   right = mid -1;
               }else {
                   left = mid +1;
               }
           }
       }
        return -1;
    }
}
