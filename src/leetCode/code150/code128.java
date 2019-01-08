package leetCode.code150;

import java.util.HashMap;
import java.util.Map;

public class code128 {
    public static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive1(nums));
    }

    private static int longestConsecutive1(int[] nums) {

        /**
         利用一个map保存各个候选最长序列的左右边界及其长度, 例如{1,2,3,4,5}中数字1和5对应的长度都是5
         依次遍历每个数num, 如果map中存在num-1或num+1则更新num所处的序列长度及其边界值
         **/
        int ret = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(!map.containsKey(num)) {
                // 获取左右边界对应的序列长度
                int left = map.getOrDefault(num-1, 0);
                int right = map.getOrDefault(num+1, 0);
                // 更新最长序列长度
                int len = left+right+1;
                ret = len > ret ? len : ret;
                map.put(num-left, len);
                map.put(num+right, len);
                // 把num加入map中防止重复判断(关键在于将num加入keyset中, value可以是任意值)
                map.put(num, len);
            }
        }
        return ret;
    }

//    private static int longestConsecutive(int[] nums) {
//        Arrays.sort(nums);
//        int[] dp = new int[nums.length+1];
//        dp[0] = 1;
//        int max =1;
//        for (int i = 1; i <nums.length-1; i++) {
//            if (nums[i] - nums[i-1]==1){
//                dp[i] = dp[i-1]+1;
//                max = Math.max(max,dp[i]);
//            }else {
//                dp[i] = 0;
//            }
//        }
//        return max;
//    }
}
