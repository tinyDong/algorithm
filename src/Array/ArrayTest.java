package Array;


import java.util.Arrays;

//给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
//你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用
//给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
public class ArrayTest {

    public static final int[] nums=new int[]{2, 7, 11, 15};

    public static int[] findTargetNumbers(int[] arr,int target){

        int low =0,high =arr.length-1;

        while (low<high){
            int value = arr[low]+arr[high];
            if (value==target){
                return new int[]{low,high};
            }else if (value > target){
                high--;
            }else {
                low++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTargetNumbers(nums,18)));
    }
}
