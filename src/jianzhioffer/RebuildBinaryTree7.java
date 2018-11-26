package jianzhioffer;

public class RebuildBinaryTree7 {

    private static class TreeNode{
        private Integer data =null;
        private TreeNode leftChild = null;
        private TreeNode rightChild = null;
        private boolean isVisted=false;

        public TreeNode(){}

        public TreeNode(Integer data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        int[] preOrder =new int[]{3,9,20,15,7};
        int[] inorder =new int[]{9,3,15,20,7};

        TreeNode root = reConstructBinaryTree(preOrder,inorder);


        System.out.println(root.data);

    }

    /**
     *
     * @param pre  前序遍历
     * @param in    中序遍历
     * @return        二叉树根节点
     */
    public static TreeNode reConstructBinaryTree(int[] pre,int[] in) {
        return construct(pre,0,pre.length-1,in,0,in.length-1);
    }
    /**
     *
     * @param pre    前序遍历
     * @param preStart    前序遍历的开始位置
     * @param preEnd    前序遍历的结束位置
     * @param in    中序遍历
     * @param inStart    中序遍历的开始位置
     * @param inEnd    中序遍历的结束位置
     * @return        数的根节点
     */
    private static TreeNode construct(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preEnd<preStart){
            return null;
        }
        int rootValue = pre[preStart];

        int index = inStart;
        while (inStart<inEnd&&in[index]!=rootValue){
            index++;
        }
        TreeNode root = new TreeNode(rootValue);

        root.leftChild  = construct(pre,preStart+1,preStart+index-inStart,in,inStart,index);
        root.rightChild = construct(pre,preStart+index-inStart+1,preEnd,in,index+1,inEnd);
        return root;
    }

}
