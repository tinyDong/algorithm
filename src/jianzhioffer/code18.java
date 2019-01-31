package jianzhioffer;

public class code18 {
    public static void main(String[] args) {
        TreeNode root1 = TreeUtils.stringToTreeNode("8,6,10,5,7,9,11");
        Mirror(root1);
        System.out.println(root1);
    }

    public static void Mirror(TreeNode root) {
        if (root ==null ){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        Mirror(root.left);
        Mirror(root.right);

    }
}
