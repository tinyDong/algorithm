package leetcode1;

import java.util.HashMap;

public class code1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)){
                return new int[]{map.get(value),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
