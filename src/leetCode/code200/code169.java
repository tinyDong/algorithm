package leetCode.code200;

import java.util.Arrays;

public class code169 {
//    示例 1:
//
//    输入: [3,2,3]
//    输出: 3
//    示例 2:
//
//    输入: [2,2,1,1,1,2,2]
//    输出: 2
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        int result = majorityElement1(nums);
        System.out.println(result);

    }
    public static int majorityElement1(int[] nums) {
        int res =0,count = 0;
        for (int num :nums){
            if (count==0){
                res = num;
                count++;
            }else if (res == num){
                count++;
            }else {
                count--;
            }
        }
        return res;
    }


    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
