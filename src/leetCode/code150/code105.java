package leetCode.code150;

//根据一棵树的前序遍历与中序遍历构造二叉树。
//
//注意:
//你可以假设树中没有重复的元素。
//
//例如，给出
//
//前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7]

//关键 找到根结点 划分左右子树
public class code105 {

    public static void main(String[] args) {
        int[] preorder =new int[]{3,9,20,15,7};
        int[] inorder =new int[]{9,3,15,20,7};
        TreeNode res = buildTree(preorder,inorder);
        System.out.println(res);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        return helper(preorder,inorder,0,0,inorder.length-1);
    }

    private static TreeNode helper(int[] preorder, int[] inorder,int preIndex,int inStart,int inEnd){
        if (inEnd<inStart){
            return null;
        }


        int index = inStart;
        while (index<inEnd && preorder[preIndex]!=inorder[index]){
            index++;
        }
        TreeNode node = new TreeNode(preorder[preIndex]);
        node.left = helper(preorder,inorder,preIndex+1,inStart,index-1);
        node.right = helper(preorder,inorder,preIndex+index-inStart+1,index+1,inEnd);
        return node;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
