package jianzhioffer;

public class code58 {
    public static void main(String[] args) {

    }


    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot==null){
            return true;
        }
        return isSame(pRoot.left,pRoot.right);
    }

    private boolean isSame(TreeNode left, TreeNode right) {

        if (left!=null && right!=null){
            if (left.val != right.val){
                return false;
            }

            return isSame(left.left,right.right) && isSame(left.right,right.left);
        }else {
            return left==right;
        }

    }
}
