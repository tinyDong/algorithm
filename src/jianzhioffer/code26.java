package jianzhioffer;
//https://www.cnblogs.com/keedor/p/4467040.html
public class code26 {


    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("8,6,10,5,7,9,11");

        TreeNode res = Convert(root);
        System.out.println(res);
    }

    public static TreeNode Convert(TreeNode root) {
       TreeNode last = helper(root ,null);
       while (last.left!=null){
           last = last.left;
       }
       return last;
    }

    private static TreeNode helper(TreeNode root , TreeNode last) {
        if (root==null){
            return last;
        }
        if (root.left!=null){
            last = helper(root.left,last);
        }
        root.left = last;
        if (last!=null){
            last.right = root;
        }
        last = root;
        if (root.right!=null){
            last = helper(root.right,last);
        }
        return last;

    }










//    public static TreeNode Convert(TreeNode root) {
//        TreeNode lastNode = null;
//
//        lastNode=baseconvert(root, null);
//
//        TreeNode headNode = lastNode;
//
//        while (headNode.left != null)
//            headNode = headNode.left;
//        return headNode;
//    }


//    public static TreeNode baseconvert(TreeNode root, TreeNode lastNode) {
//
//        if (root == null)
//            return lastNode;
//        TreeNode current = root;
//
//        // 转换左子树
//        if (current.left != null)
//
//            lastNode=baseconvert(current.left, lastNode);
//
//        // 与根节点的衔接
//        current.left = lastNode;
//
//        if (lastNode != null)
//
//            lastNode.right = current;
//
//        lastNode = current;
//
//        // 转换右子树
//        if (current.right != null)
//
//            lastNode=baseconvert(current.right, lastNode);
//
//        return lastNode;

//    }
}
