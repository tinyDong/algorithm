package leetCode;

import java.util.ArrayList;
import java.util.List;

//给定一个没有重复数字的序列，返回其所有可能的全排列。
//
//示例:
//
//输入: [1,2,3]
//输出:
//[
//[1,2,3],
//[1,3,2],
//[2,1,3],
//[2,3,1],
//[3,1,2],
//[3,2,1]
//]
public class code46 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        dfs(res,new ArrayList<>(),nums,0);
        return res;
    }

    private static void dfs(List<List<Integer>> res, ArrayList<Integer> subList, int[] nums, int index) {
        System.out.println(index + "======"+subList);
        if (subList.size()==nums.length){
            res.add(new ArrayList<>(subList));
            return;
        }

        if (index>nums.length-1){
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (subList.contains(nums[i])){
                continue;
            }
            subList.add(nums[i]);
            dfs(res,subList,nums,index);
            if (!subList.isEmpty()){
                subList.remove(subList.size()-1);
            }
        }


    }
}
