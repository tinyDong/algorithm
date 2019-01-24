package leetCode.code250;


//示例 1:
//
//输入: [1,2,3,1]
//输出: true
//示例 2:
//
//输入: [1,2,3,4]
//输出: false
//示例 3:
//
//输入: [1,1,1,3,3,4,3,2,4,2]
//输出: true

import java.util.HashSet;
import java.util.Set;

public class code217 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer integer :nums){
            if (!set.add(integer)){
                return true;
            }
        }
        return false;
    }
}
