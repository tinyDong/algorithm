package jianzhioffer;

public class code38 {
    public static void main(String[] args) {

    }

    public int TreeDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return root.val + Math.max(TreeDepth(root.left),TreeDepth(root.right));
    }
}
