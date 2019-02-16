package jianzhioffer;

public class code39 {
    public static void main(String[] args) {

    }


    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }

        if(Math.abs(getMaxDepth(root.left) - getMaxDepth(root.right))>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    private int getMaxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return 1 + Math.max(getMaxDepth(root.left),getMaxDepth(root.right));
    }
}

