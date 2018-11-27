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

    private static TreeNode reConstructBinaryTree(int[] preOrder, int[] inorder) {

        return rebuildTree(preOrder,0,preOrder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode rebuildTree(int[] preOrder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart>preEnd){
            return null;
        }
        int rootValue = preOrder[preStart];
        int index = inStart;
        while (index<inEnd&&inorder[index]!=rootValue){
            index++;
        }
        TreeNode node = new TreeNode(rootValue);
        node.leftChild = rebuildTree(preOrder,preStart+1,preStart+index-inStart,inorder,inStart,index);
        node.rightChild = rebuildTree(preOrder,preStart+index-inStart+1,preEnd,inorder,index+1,inEnd);
        return node;
    }


}
