package jianzhioffer;

import java.util.ArrayList;

public class code24 {

    public static void main(String[] args) {

        TreeNode root = TreeUtils.stringToTreeNode("8,6,10,5,11,9,7");
        ArrayList<ArrayList<Integer>> res = FindPath(root,25);

        for (ArrayList<Integer> integers : res){
            System.out.println(integers);

        }

    }

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        helper(root,new ArrayList<>(),res,target);
        return res;
    }

    private static void helper(TreeNode root,ArrayList<Integer> subList, ArrayList<ArrayList<Integer>> res, int target) {
        if (root ==null || root.val>target){
            return;
        }

        subList.add(root.val);
        if (root.left==null && root.right==null){
            if (root.val==target){
                res.add(new ArrayList(subList));
                subList.remove(subList.size()-1);
                return;
            }
        }
        helper(root.left,subList,res,target-root.val);
        helper(root.right,subList,res,target-root.val);
        subList.remove(subList.size()-1);
    }
}
