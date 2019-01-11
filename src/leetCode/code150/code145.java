package leetCode.code150;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class code145 {
    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("1,null,2,3");
        List<Integer> result = postorderTraversal(root);
        System.out.println(result.toString());
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null){
            return res;
        }

        Stack<TreeNode> stack =new Stack<>();
        Stack<Integer> result = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            result.push(temp.val);
            if (temp.left!=null){
                stack.push(temp.left);
            }

            if (temp.right!=null){
                stack.push(temp.right);
            }
        }
        while (!result.isEmpty()){
            Integer cur = result.pop();
            res.add(cur);
        }
        return res;
    }
}
