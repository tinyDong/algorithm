package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class code22 {

    public static void main(String[] args) {

        TreeNode root = TreeUtils.stringToTreeNode("8,6,10,5,7,9,11");
        System.out.println(PrintFromTopToBottom(root));
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            res.add(temp.val);
            if (temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }
        }
        return res;
    }
}
