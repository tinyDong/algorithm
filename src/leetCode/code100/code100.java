package leetCode.code100;

public class code100 {
    public static void main(String[] args) {


    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null){
            return true;
        }
        if (p == null || q == null || p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

}
