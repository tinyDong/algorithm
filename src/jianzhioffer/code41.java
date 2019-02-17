package jianzhioffer;

import java.util.ArrayList;
//https://www.cnblogs.com/lfeng1205/p/5995711.html
public class code41 {
    public static void main(String[] args) {

        System.out.println(FindContinuousSequence(100));
    }

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        helper(res,new ArrayList<>(),0,sum);
        return res;
    }

    private static void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> subList, int index, int target) {
        if (getSum(subList) == target){
            res.add(new ArrayList<>(subList));
            return;
        }

        for (int i = index; i < target; i++) {
            if (!subList.isEmpty()&& subList.get(subList.size()-1)!=i-1){
                break;
            }
            subList.add(i);
            if (getSum(subList)>target&&!subList.isEmpty()){
                subList.remove(subList.size()-1);
                break;
            }

            helper(res,subList,i+1,target);

            if (!subList.isEmpty())
            subList.remove(subList.size()-1);
        }
    }

    private static int getSum(ArrayList<Integer> subList) {
        int res = 0;
        for (Integer integer : subList){
            res += integer;
        }
        return res;
    }
}
