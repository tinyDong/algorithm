package leetCode.code250;

public class code235 {
    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("3,5,1,6,2,0,8,null,null,7,4");
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }
        if ((root.val - p.val)*(root.val-q.val)<=0){
            return root;
        }else if (root.val-p.val>0){
            root = lowestCommonAncestor(root.left,p,q);
        }else {
            root = lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
