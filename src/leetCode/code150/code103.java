package leetCode.code150;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class code103 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        Boolean left = true;
        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                temp.add(cur.val);
                if (left){
                    if (cur.left!=null){
                        queue.add(cur.left);
                    }
                    if (cur.right!=null){
                        queue.add(cur.right);
                    }
                }else {
                    if (cur.right!=null){
                        queue.add(cur.right);
                    }
                    if (cur.left!=null){
                        queue.add(cur.left);
                    }
                }
            }
            left = !left;
        }
        return res;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
