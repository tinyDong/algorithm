package leetCode.code150;

//根据一棵树的中序遍历与后序遍历构造二叉树。
//
//注意:
//你可以假设树中没有重复的元素。
//
//例如，给出
//
//中序遍历 inorder = [9,3,15,20,7]
//后序遍历 postorder = [9,15,7,20,3]
//返回如下的二叉树：
//
//3
/// \
//9  20
///  \
//15   7
public class code106 {

    public static void main(String[] args) {

    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0)
            return null;
        return helper(postorder,postorder.length-1,inorder,0,inorder.length-1);
    }

    private static TreeNode helper(int[] postorder, int postIndex, int[] inorder, int inStart, int inEnd) {
        if (inStart>inEnd){
            return null;
        }

        if (inStart == inEnd){
            return new TreeNode(inorder[inStart]);
        }
        int index = inStart;
        while (index<inEnd && inorder[index]!=postorder[index]){
            index++;
        }
        TreeNode node = new TreeNode(postorder[postIndex]);
        node.left = helper(postorder,postIndex -(inEnd-index)-1,inorder,inStart,index-1);
        node.right = helper(postorder,postIndex-1,inorder,index+1,inEnd);
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
