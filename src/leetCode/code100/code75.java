package leetCode.code100;

import java.util.Arrays;

//注意:
//不能使用代码库中的排序函数来解决这道题。
//
//示例:
//
//输入: [2,0,2,1,1,0]
//输出: [0,0,1,1,2,2]
public class code75 {
    public static void main(String[] args) {
        int[] nums =new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort1(int[] arr){
//        int length = arr.length;
//        int start = 0;
//        int end = length-1;
//        int current = 0;
//        while (current<end){
//            if (arr[current]<1){
//                swap(current,start,arr);
//                current++;
//                start++;
//            }else if (arr[current]>1){
//                swap(current,end,arr);
//                end--;
//            }else {
//                current++;
//            }
//        }

    }
    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        for (int i = 0; i < right; i++) {
            if (nums[i]==0){
                swap(i,left++,nums);
            }else if (nums[i] ==2){
                swap(i--,right--,nums);
            }
        }
    }

    public static void swap(int s , int end ,int[] nums){
        int temp = nums[s];
        nums[s] =nums[end];
        nums[end] = temp;
    }
}
