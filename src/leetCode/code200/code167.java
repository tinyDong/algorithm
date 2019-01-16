package leetCode.code200;


//输入: numbers = [2, 7, 11, 15], target = 9
//输出: [1,2]
//解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。

import java.util.Arrays;

public class code167 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[]res = twoSum(nums,9);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length-1;
        int[] res = new int[2];
        while (start<end){
            int curValue = numbers[start] + numbers[end];
            if (curValue == target){
                res[0] = start+1;
                res[1] = end+1;
                break;
            }else if (curValue>target){
                end--;
            }else {
                start++;
            }
        }
        return res;
    }
}
