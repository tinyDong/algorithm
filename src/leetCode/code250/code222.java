package leetCode.code250;

public class code222 {
    public static void main(String[] args) {


    }

    public int countNodes(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (left==right){
            return 1<<left + countNodes(root.right);
        }else {
            return 1<<right + countNodes(root.left);
        }
    }

    private int getDepth(TreeNode left) {
        int res =0;
        while (left!=null){
            left = left.left;
            res++;
        }
        return res;
    }
}
