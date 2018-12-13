package leetCode.code50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//示例 1:
//
//输入: candidates = [2,3,6,7], target = 7,
//所求解集为:
//[
//[7],
//[2,2,3]
//]
//示例 2:
//
//输入: candidates = [2,3,5], target = 8,
//所求解集为:
//[
//[2,2,2,2],
//[2,3,3],
//[3,5]
//]
public class code39 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,5};
        int target = 8;
        Arrays.sort(nums);
        System.out.println(combinationSum(nums,target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res,new ArrayList<>(),candidates,target,0);
        return res;
    }

    private static void dfs(List<List<Integer>> res, ArrayList<Integer> subList, int[] nums, int target,int index) {
        System.out.println(subList);
        if (getSum(subList)==target){
            res.add(new ArrayList<>(subList));
            return;
        }

        if (getSum(subList)>target){
            return;
        }

        for (int i = index; i < nums.length; i++) {
            subList.add(nums[i]);
            dfs(res,subList,nums,target,i);
            if (!subList.isEmpty()){
                subList.remove(subList.size()-1);
            }
        }
    }

    private static Integer getSum(ArrayList<Integer> list){
        Integer res = 0;
        for (Integer integer:list){
            res = res + integer;
        }
        return res;
    }
}
