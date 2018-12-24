package leetCode.code100;

//给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
//
//说明：解集不能包含重复的子集。
//
//示例:
//
//输入: [1,2,2]
//输出:
//[
//[2],
//[1],
//[1,2,2],
//[2,2],
//[1,2],
//[]
//]

import java.util.ArrayList;
import java.util.List;

public class code90 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2};
        List<List<Integer>> result = subsetsWithDup(nums);
        for (List<Integer> res : result){
            System.out.println(res);
        }

    }


    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        dfs(res,new ArrayList<>(),0,nums);
        return res;
    }

    private static void dfs(List<List<Integer>> res, ArrayList<Integer> subList, int index, int[] nums) {
        res.add(new ArrayList<>(subList));
        for (int i = index; i < nums.length; i++) {
            subList.add(nums[i]);
            dfs(res,subList,i+1,nums);
            subList.remove(subList.size()-1);
            while (i + 1 < nums.length && nums[i] == nums[i + 1]){
                i++;
            }
        }

    }

}
