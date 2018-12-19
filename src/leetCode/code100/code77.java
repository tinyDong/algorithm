package leetCode.code100;

//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
//示例:
//
//输入: n = 4, k = 2
//输出:
//[
//[2,4],
//[3,4],
//[2,3],
//[1,2],
//[1,3],
//[1,4],
//]

import java.util.ArrayList;
import java.util.List;

public class code77 {
    public static void main(String[] args) {
        int[] nums =new int[]{1,2,3,4};

        System.out.println(combine(nums,2));

    }

    public static List<List<Integer>> combine(int[] nums, int k) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums,k,new ArrayList<>(),res,0);
        return res;
    }

    private static void dfs(int[] nums, int k, ArrayList<Integer> subList, List<List<Integer>> res, int index) {

        if (subList.size()>2){
            return;
        }
        System.out.println(subList);
        if (subList.size()==k){
            res.add(new ArrayList<>(subList));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            subList.add(nums[i]);
            dfs(nums,k,subList,res,i+1);
            if (!subList.isEmpty()){
                subList.remove(subList.size()-1);
            }
        }

    }


}
