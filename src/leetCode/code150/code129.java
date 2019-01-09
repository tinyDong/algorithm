package leetCode.code150;

public class code129 {

    public static void main(String[] args) {

        TreeNode head = TreeUtils.stringToTreeNode("4,9,0,5,1");

        int result = sumNumbers(head);
        System.out.println(result);
    }

    public static int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
        return sumNumbers(root,0);
    }
    public static int sumNumbers(TreeNode root,int k) {
        int left =0 ,right = 0;
        if (root.left==null && root.right==null){
            return root.val + k;
        }
        if (root.left!=null){
            left = sumNumbers(root.left,10 * (k + root.val));
        }
        if (root.right!=null){
            right = sumNumbers(root.right,10 * (k + root.val));
        }
        return left + right;
    }
}
