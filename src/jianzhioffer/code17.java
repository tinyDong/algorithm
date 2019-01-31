package jianzhioffer;

import java.util.Stack;

public class code17 {


    public static void main(String[] args) {

        TreeNode root1 = TreeUtils.stringToTreeNode("8,null,9,3,2");
//        TreeNode root2 = TreeUtils.stringToTreeNode("");

        System.out.println(HasSubtree1(root1,null));
    }

    private static boolean HasSubtree1(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null){
            return false;
        }
        return isSame(root1,root2)||HasSubtree1(root1.left,root2)||HasSubtree1(root1.right,root2);
    }

    private static boolean isSame(TreeNode root1, TreeNode root2){
        if (root2 == null){
            return true;
        }
        if(root1==null){
            return false;
        }
        return root1.val==root2.val&&isSame(root1.left,root2.left)&&isSame(root1.right,root2.right) ;
    }



    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 ==null ||root2 == null){
            return false;
        }
        String tree1 = getTreeStr(root1);
        String tree2 = getTreeStr(root2);

        return tree1.contains(tree2);

    }

    private static String getTreeStr(TreeNode root1) {
        StringBuilder sb = new StringBuilder();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root1);
        TreeNode replace = new TreeNode(-1);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            sb.append("#");
            if (temp == replace){
                sb.append("null");
            }else {
                sb.append(temp.val);

                if (temp.right==null){
                    stack.push(replace);
                }else {
                    stack.push(temp.right);
                }

                if (temp.left !=null){
                    stack.push(temp.left);
                }else {
                    stack.push(replace);
                }

            }
        }

        return sb.toString();
    }
}
