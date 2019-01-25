package leetCode.code250;

import java.util.ArrayList;
import java.util.List;

//示例 1:
//输入: [0,1,2,4,5,7]
//输出: ["0->2","4->5","7"]
//解释: 0,1,2 可组成一个连续的区间; 4,5 可组成一个连续的区间。
//
//示例 2:
//输入: [0,2,3,4,6,8,9]
//输出: ["0","2->4","6","8->9"]
//解释: 2,3,4 可组成一个连续的区间; 8,9 可组成一个连续的区间。

public class code228 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,2,3,4,6,8,9};

        List<String> res = summaryRanges(nums);
        System.out.println(res);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            Integer start = nums[i] , last = nums[i];
            while (i+1<nums.length && nums[i]+1 == nums[i+1]){
                i++;
                last = nums[i];
            }
            if (!last.equals(start)){
                sb.append("->").append(last);
            }
            res.add(sb.toString());
        }
        return res;
    }
}
