package leetCode.code250;

import java.util.HashMap;
import java.util.Map;

public class code219 {


    public static void main(String[] args) {
        int[] nums  = new int[]{1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate1(nums,k));
    }


    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                if (k>= i - map.get(nums[i])){
                    return true;
                }
                map.put(nums[i],i);
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
    }


    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i ; j--) {
                if (nums[i]==nums[j]&&j-i<=k){
                    return true;
                }
            }
        }
        return false;
    }


}
