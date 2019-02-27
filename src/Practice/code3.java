package Practice;

public class code3 {

    public static void main(String[] args) {

    }

    public void flatten(TreeNode root) {

        if (root==null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        if (root.left!=null){
            TreeNode cur = root.right;
            root.right = root.left;
            root.left = null;
            TreeNode right = root.right;
            while (right.right!=null){
                right = right.right;
            }
            right.right =cur;
        }

    }


}
