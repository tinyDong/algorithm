package leetCode.code150;

import java.util.ArrayList;
import java.util.List;

public class code113 {


    public static void main(String[] args) {
//        22
        TreeNode root = TreeUtils.stringToTreeNode("5,4,8,11,null,13,4,7,2,null,null,5,1");

        List<List<Integer>> res = pathSum(root,22);

        String result = TreeUtils.int2dListToString(res);
        System.out.println(result);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root,new ArrayList<>(),res,sum);
        return res;
    }

    private static void helper(TreeNode root,List<Integer> subList,List<List<Integer>> res, int sum) {
        if (root==null || root.val>sum){
            return;
        }

        subList.add(root.val);
        if (root.val == sum && root.left == null && root.right == null){
            res.add(new ArrayList<>(subList));
            subList.remove(subList.size()-1);
            return;
        }

        helper(root.left,subList,res,sum - root.val);

        helper(root.right,subList,res,sum - root.val);

        subList.remove(subList.size()-1);
    }

    private static Integer getSum(List<Integer> subList){
        Integer sum = 0;
        for (Integer integer : subList){
            sum = sum + integer;
        }
        return sum;
    }


}
