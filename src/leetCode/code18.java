package leetCode;

import java.util.ArrayList;

//四数之和
//给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
//
//满足要求的四元组集合为：
//[
//[-1,  0, 0, 1],
//[-2, -1, 1, 2],
//[-2,  0, 0, 2]
//]
public class code18 {

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int[] nums = new int[]{-2, -1, 0 , 0, 1, 2};
        int target = 0;

        ArrayList<ArrayList<Integer>> result = fourSum(nums,target);
        System.out.println(result);

    }

    private static ArrayList<ArrayList<Integer>> fourSum(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        dfs(res,new ArrayList<Integer>(),nums,0,target);
        return res;
    }

    private static void dfs(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> subList, int[] nums, int index, int target) {
        System.out.println(subList);
        if (subList.size()==4){
            if (getSum(subList)==target){
                res.add(new ArrayList<>(subList));
            }
            return;
        }

        if (index>nums.length-1){
            return;
        }

        for (int i = index; i <nums.length; i++) {
            if (i!=index && nums[i] == nums[i-1]){
                continue;
            }
            subList.add(nums[i]);
            if (getSum(subList)>target&&nums[i]>0){
                if (!subList.isEmpty()){
                    subList.remove(subList.size()-1);
                }
                return;
            }

            dfs(res,subList,nums,i+1,target);
            if (!subList.isEmpty()){
                subList.remove(subList.size()-1);
            }

        }

    }


    private static int  getSum(ArrayList<Integer> condidate) {
        int total = 0;
        for (Integer num : condidate) {
            total += num;
        }
        return total;
    }

}
