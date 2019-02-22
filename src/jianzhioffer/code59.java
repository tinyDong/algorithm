package jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class code59 {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("8,6,10,5,7,9,11");
        System.out.println(Print(root));
    }

    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (pRoot == null){
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();

        queue.add(pRoot);
        boolean needReserve = false;
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode root = queue.poll();
                if (root.left!=null){
                    queue.add(root.left);
                }
                if (root.right!=null){
                    queue.add(root.right);
                }
                list.add(root.val);
            }
            if (needReserve){
                Collections.reverse(list);
            }
            res.add(list);
            needReserve=!needReserve;
        }
        return res;
    }
}
