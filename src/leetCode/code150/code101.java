package leetCode.code150;


public class code101 {

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return false;
        }
        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode left , TreeNode right){
        if ((left==null&&right!=null)||(left!=null&&right==null)|| (left.val!=right.val)){
            return false;
        }
        return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
