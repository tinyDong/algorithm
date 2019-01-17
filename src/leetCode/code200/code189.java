package leetCode.code200;

import java.util.Arrays;
//示例 1:
//
// 7 123456
//654321 7
//输入: [1,2,3,4,5,6,7] 和 k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
public class code189 {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3};

        int target =4;
        rotate2(nums,target);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotate2(int[] nums, int target) {
        if (nums==null||nums.length==0 ||((target%=nums.length)==0)){
            return;
        }
        int n  = nums.length;
        swap(0,n-target-1,nums);
        swap(n - target,n-1,nums);
        swap(0,nums.length-1,nums);
    }


    public static void rotate1(int[] nums, int k) {
        for (int j = 0; j <=k ; j++) {
            int temp = nums[nums.length-1];
            for (int i = nums.length-2; i >=0; i--) {
                nums[i+1] = nums[i];
            }
            nums[0] =temp;
        }

    }

    private static void swap(int start , int end ,int[] nums){
        while (start>=0&&start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] =temp;
            start++;
            end--;
        }
    }
}
