package leetCode.code150;
//给定一个二叉树，原地将它展开为链表。
public class code114 {

    public static void main(String[] args) {

    }


    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }

        flatten(root.left);
        flatten(root.right);
        if (root.left!=null){
            TreeNode right = root.right;
            root.right = root.left;
            root.left = null;

            TreeNode cur = root.right;
            while (cur.right!=null){
                root = root.right;
            }
            root.right = right;
        }
    }
}
