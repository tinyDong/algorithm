package leetCode.code50;

//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
//
//你的算法时间复杂度必须是 O(log n) 级别。
//
//如果数组中不存在目标值，返回 [-1, -1]。
//
//示例 1:
//
//输入: nums = [5,7,7,8,8,10], target = 8
//输出: [3,4]
//示例 2:
//
//输入: nums = [5,7,7,8,8,10], target = 6
//输出: [-1,-1]


import java.util.Arrays;

public class code34 {

    public static void main(String[] args) {
        int[] nums = new int[]{5,5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange1(nums,7)));
    }

    private static int[] searchRange1(int[] nums, int target) {
        int[] res =new int[]{-1,-1};
        int left = 0, right = nums.length - 1;

        while (left<right){
            int mid = left + (right-left)/2;
            if (target<=nums[mid]){
                right = mid;
            }else {
                left = mid+1;
            }
        }
        if (nums[left]!=target){
            return res;
        }
        res[0] = left;
        right = nums.length-1;
        while (left<right){
            int mid = left + (right-left)/2;
            if (target>=nums[mid]){
                left =mid+1;
            }else {
                right = mid;
            }
        }
        res[1] = left-1;
        return res;
    }





//        int mid = left + (right - left) / 2;
//        if (nums[mid] < target){
//            left = mid + 1;
//        } else{
//            right = mid;
//        }
//    }
//        if (nums[right] != target){
//        return res;
//    }
//    res[0] = right;
//    right = nums.length-1;
//        while (left < right) {
//        int mid = left + (right - left) / 2;
//        if (nums[mid] <= target){
//            left = mid + 1;
//        } else {
//            right= mid;
//        }
//    }
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};

        int left = 0;
        int rigth = nums.length-1;

        while (left<=rigth){
            int mid = left + (rigth-left)/2;
            if (nums[mid]==target){
                int low = mid;
                int high = mid;
                while (nums[low]==target||nums[high]==target){
                    if (nums[low] ==target ){
                        res[0]=low;
                        low--;
                    }
                    if (nums[high]==target){
                        res[1]=high;
                        high++;
                    }
                }
                break;
            }else if (target<nums[mid]){
                rigth = mid -1;
            }else {
                left = mid+1;
            }
        }


        return res;
    }
}
