package leetCode.code50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code40 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,5,6,7,10};
        int target = 8;
        Arrays.sort(nums);
        System.out.println(combinationSum(nums,target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res,new ArrayList<>(),candidates,target,0);
        return res;
    }

    private static void dfs(List<List<Integer>> res, ArrayList<Integer> subList, int[] nums, int target, int index) {
        System.out.println("index ="+index+"subList = "+subList);
        if (getSum(subList) ==target){
            res.add(new ArrayList<>(subList));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (i+1<nums.length&&nums[i]==nums[i+1]){
                continue;
            }
            subList.add(nums[i]);
            if (getSum(subList)>target){
                if (!subList.isEmpty()){
                    subList.remove(subList.size()-1);
                }
                return;
            }
            dfs(res,subList,nums,target,i+1);
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
