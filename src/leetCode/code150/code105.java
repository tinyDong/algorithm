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
public class code105 {

    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    public TreeNode helper(int[] preorder, int preStart, int preEnd, int[] inorder,int inStart, int inEnd){
        int rootValue = preorder[preStart];
        int index = inStart;
        while (index < inEnd && inorder[index]!=rootValue){
            index++;
        }
        TreeNode root = new TreeNode(rootValue);
        root.left = helper(preorder,preStart+1,preStart+index - inStart,inorder,inStart,index);
        root.right = helper(preorder,preStart + index-inStart+1,preEnd,inorder,index+1,inEnd);
        return root;
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
