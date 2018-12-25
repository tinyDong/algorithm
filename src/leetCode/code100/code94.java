package leetCode.code100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class code94 {
    public static void main(String[] args) {


    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root.left!=null){
            inorderTraversal(root.left);
        }
        res.add(root.val);
        if (root.right!=null){
            inorderTraversal(root.right);
        }
        return res;
    }

    public static List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty()||root!=null){
            if (root!=null){
                stack.push(root);
                root = root.left;
            }else {
                TreeNode cur = stack.pop();
                res.add(cur.val);
                root = cur.right;
            }
        }
        return res;
    }



    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
