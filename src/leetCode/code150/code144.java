package leetCode.code150;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class code144 {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("1,null,2,3");
        List<Integer> result = preorderTraversal(root);
        System.out.println(result.toString());
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        List<Integer> resultlist = new ArrayList<>();
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            resultlist.add(cur.val);
            if (cur.right!=null){
                stack.push(cur.right);
            }
            if (cur.left!=null){
                stack.push(cur.left);
            }
        }
        return resultlist;
    }
}
