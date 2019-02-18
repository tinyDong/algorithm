package jianzhioffer;

import java.util.ArrayList;
//https://www.cnblogs.com/lfeng1205/p/5995711.html
public class code41 {
    public static void main(String[] args) {

        System.out.println(FindContinuousSequence2(100));
    }


    public static ArrayList<ArrayList<Integer>> FindContinuousSequence2(int sum) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int start = 1 ,end = 2;

        while (start <sum/2+1){
            int curSum = getSum(start,end);
            if (curSum == sum){
                ArrayList<Integer> subList = new ArrayList<>();
                for (int i = start; i <=end ; i++) {
                    subList.add(i);
                }
                res.add(subList);
                start++;
                end++;
            }else if (curSum > sum){
                start++;
            }else {
                end++;
            }
        }
        return res;
    }

    private static int getSum(int start, int end) {
        int res = 0;
        for (int i = start; i <= end; i++) {
            res += i;
        }
        return res;
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
