package leetCode.code100;
//验证二叉搜索树


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class code98 {


    public static void main(String[] args) {
//        int[] nums = new int[]{5,1,4,null,null,3,6};
    }


    public static boolean isValidBST(TreeNode root) {


        List<Integer> values = new ArrayList<>();

        midOrder(root,values);
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i)<values.get(i-1)){
                return false;
            }
        }
        return true;
    }

    private static void midOrder(TreeNode root, List<Integer> values) {

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()||root!=null){
            if (root!=null){
                stack.push(root);
                root = root.left;
            }else {
                root = stack.pop();
                values.add(root.val);
                root = root.right;
            }
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
