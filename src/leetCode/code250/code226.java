package leetCode.code250;

public class code226 {


    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("4,2,7,1,3,6,9");
        TreeNode res = invertTree(root);
        System.out.println(res);
    }

    public static TreeNode invertTree(TreeNode root) {

        if (root==null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right =temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

}
