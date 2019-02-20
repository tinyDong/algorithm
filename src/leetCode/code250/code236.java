package leetCode.code250;

public class code236 {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("3,5,1,6,2,0,8,null,null,7,4");

        lowestCommonAncestor(root,null,null);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // root为空
        if(root == null || p == null || q == null) {
            return null;
        }
        // 如果p或者q为root（返回条件）
        if(root == p || root == q) {
            return root;
        }
        // 递归左子树，找到左子树中的p或者q
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // 递归右子树，找到右子树中的p或者q
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 如果左子树找不到任何一个，返回右子树
        if(left == null) {
            return right;
        }
        // 如果右子树也找不到任何一个，返回左子树
        if(right == null) {
            return left;
        }
        // 否则，左右字数都能找到任何一个，说明当前root为祖先节点
        return root;
    }

}
