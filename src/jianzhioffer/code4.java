package jianzhioffer;

//前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7]
public class code4 {
    public static void main(String[] args) {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};

        TreeNode node =buildTree(preorder,inorder);

        System.out.println(node);
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,0,inorder.length-1);
    }

    private static TreeNode helper(int[] preorder, int[] inorder, int preIndex, int inStart, int inEnd) {
        if (inStart>inEnd){
            return null;
        }

        int rootValue = preorder[preIndex];
        int index = inStart;
        while (index<inEnd && inorder[index] !=rootValue){
            index++;
        }
        TreeNode root = new TreeNode(rootValue);
        root.left = helper(preorder,inorder,preIndex+1,inStart,index-1);
        root.right = helper(preorder,inorder,preIndex + index-inStart+1,index+1,inEnd);
        return root;
    }
}
