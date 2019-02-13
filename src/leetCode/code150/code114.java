package leetCode.code150;
//给定一个二叉树，原地将它展开为链表。
public class code114 {

    public static void main(String[] args) {
        TreeNode root  = TreeUtils.stringToTreeNode("1,2,5,3,4,null,6");

        flatten(root);
        System.out.println(root);
    }


    public static void flatten(TreeNode root) {
        if (root==null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        if (root.left!=null){
            TreeNode right = root.right;
            root.right = root.left;
            root.left =null;
            TreeNode temp = root.right;
            while (temp.right!=null){
                temp = temp.right;
            }
            temp.right = right;
        }

    }
}
