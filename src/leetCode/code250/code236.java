package leetCode.code250;

public class code236 {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("3,5,1,6,2,0,8,null,null,7,4");

        lowestCommonAncestor(root,null,null);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if (root==null){
           return null;
       }

       if (root == p || root ==q){
           return root;
       }

       TreeNode left = lowestCommonAncestor(root.left,p,q);
       TreeNode right = lowestCommonAncestor(root.right,p,q);
       if (left ==null){
           return right;
       }
       if (right == null){
           return left;
       }
       return root;
    }

}
