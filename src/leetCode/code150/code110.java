package leetCode.code150;

public class code110 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return false;
        }
        if (Math.abs(getH(root.left) - getH(root.right))>1){
            return false;
        }else {
            return isBalanced(root.left)&&isBalanced(root.right);
        }

    }

    public int getH(TreeNode root){
        if (root==null){
            return 0;
        }
        return 1 + Math.max(getH(root.left),getH(root.right));
    }


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
     }
}
