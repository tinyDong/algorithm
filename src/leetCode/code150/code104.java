package leetCode.code150;

public class code104 {

    public static void main(String[] args) {

    }


    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
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
