package leetCode.code100;

import java.util.ArrayList;
import java.util.List;

//给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
//
//说明：解集不能包含重复的子集。
//
//示例:
//
//输入: nums = [1,2,3]
//输出:
//[
//[3],
//[1],
//[2],
//[1,2,3],
//[1,3],
//[2,3],
//[1,2],
//[]
//]
public class code78 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums,new ArrayList<>(),res,0);
        return res;
    }

    private static void dfs(int[] nums, ArrayList<Integer> subList, List<List<Integer>> res, int index) {
        res.add(new ArrayList<>(subList));
        for (int i = index; i < nums.length; i++) {
            subList.add(nums[i]);
            dfs(nums,subList,res,i+1);
            subList.remove(subList.size()-1);
        }

    }

//    public static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        if(nums.length==0 || nums == null) return res;
//        helper(res,temp,nums,0);
//        return res;
//    }
//    public static void helper(List<List<Integer>> res,List<Integer> temp,int[] nums,int index){
//        //要加上new ArrayList<>()
//        res.add(new ArrayList<>(temp));
//        for(int i=index;i<nums.length;i++){
//            temp.add(nums[i]);
//            helper(res,temp,nums,i+1);
//            temp.remove(temp.size()-1);
//        }
//    }
}
