package leetCode.code250;

import java.util.ArrayList;
import java.util.List;

//找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
//
//说明：
//
//所有数字都是正整数。
//解集不能包含重复的组合。
//示例 1:
//
//输入: k = 3, n = 7
//输出: [[1,2,4]]
//示例 2:
//
//输入: k = 3, n = 9
//输出: [[1,2,6], [1,3,5], [2,3,4]]

public class code216 {
    public static void main(String[] args) {
        int k =3 , n =9;
        List<List<Integer>> res = combinationSum3(k,n);
        for (List<Integer> list:res){
            System.out.println(list.toString());
        }
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        int[] visted =new int[9];
        helper(res,new ArrayList<>(),1,k,n);
        return res;
    }

    private static void helper(List<List<Integer>> res, ArrayList<Integer> sublist, int i, int k,int n) {
        if (sum(sublist)==n&&sublist.size()==k){
            res.add(new ArrayList<>(sublist));
            return;
        }

        for (int j = i; j < 10; j++) {
            sublist.add(j);
            if (sum(sublist)>n){
                sublist.remove(sublist.size()-1);
                continue;
            }
            if (sublist.size()>k){
                sublist.remove(sublist.size()-1);
                continue;
            }
            helper(res,sublist,j+1,k,n);
            if (!sublist.isEmpty())
            sublist.remove(sublist.size()-1);
        }

    }

    private static Integer sum(ArrayList<Integer> list){
        Integer res = 0;
        for (Integer i :list){
            res += i;
        }
        return res;
    }
}
