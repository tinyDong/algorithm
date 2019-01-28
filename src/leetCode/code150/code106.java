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
public class code106 {

    public static void main(String[] args) {
        int[] nums1= new int[]{9,3,15,20,7};
        int[] nums2= new int[]{9,15,7,20,3};
        TreeNode res = buildTree(nums1,nums2);
        System.out.println(res);
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,postorder,postorder.length-1,0,inorder.length-1);
    }

    private static TreeNode helper(int[] inorder, int[] postorder,int postIndex ,int inStart,int inEnd) {

        if (inStart > inEnd){
            return null;
        }

        int rootValue = postorder[postIndex];
        int index = inStart;
        while (index < inEnd &&inorder[index] != rootValue){
            index++;
        }

        TreeNode root = new TreeNode(rootValue);
        root.left = helper(inorder,postorder,postIndex-(inEnd-index)-1,inStart,index-1);
        root.right = helper(inorder,postorder,postIndex-1,index+1,inEnd);
        return root;
    }


}
