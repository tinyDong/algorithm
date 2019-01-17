package leetCode.code200;

//示例 1:
//
//输入: [10,2]
//输出: 210
//示例 2:
//
//输入: [3,30,34,5,9]
//输出: 9534330

import java.util.ArrayList;
import java.util.List;

public class code179 {
    public static void main(String[] args) {
        int[] nums = new int[]{999999998,999999997,999999999};
        System.out.println(largestNumber(nums));
    }


    public static String largestNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        list.sort((o1, o2) -> (o2.toString()+o1.toString()).compareTo(o1.toString()+o2.toString()));

        StringBuilder res = new StringBuilder();
        for (Integer integer:list){
            res.append(integer);
        }

        return res.toString().replaceAll("^(0+)\\B", "");
    }
}
