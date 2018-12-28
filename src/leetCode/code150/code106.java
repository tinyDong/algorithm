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

//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        if(inorder.length == 0)
//            return null;
//        return buildTree(inorder,postorder,postorder.length-1,0,inorder.length-1);
//    }
//    public TreeNode buildTree(int[] inorder, int[] postorder,int postIndex,int start,int end){
//        if(start > end)
//            return null;
//        if(start == end)
//            return new TreeNode(inorder[start]);
//        int index = start;
//        for(int i = start;i <= end;i++){
//            if(inorder[i] == postorder[postIndex]){
//                index = i;
//                break;
//            }
//        }
//        TreeNode root = new TreeNode(inorder[index]);
//        root.right = buildTree(inorder,postorder,postIndex-1,index+1,end);
//        root.left = buildTree(inorder,postorder,postIndex-(end-index)-1,start,index-1);
//        return root;
//    }


//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        return helpBuild(inorder,postorder,postorder.length - 1,0,inorder.length);
//    }
//    public TreeNode helpBuild(int[] in, int[] post, int postIndex, int inFrom, int inTo) {
//        if(inFrom >= inTo){
//            return null;
//        }
//        TreeNode root = new TreeNode(post[postIndex]);
//        for(int i=inFrom;i<inTo;i++){
//            if(in[i] == post[postIndex]){
//                root.right = helpBuild(in,post,postIndex - 1,i + 1,inTo);
//                root.left = helpBuild(in,post,postIndex - (inTo - i),inFrom,i);
//                break;
//            }
//        }
//        return root;
//    }
//

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
