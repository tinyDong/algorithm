package leetCode.code200;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class code199 {
    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("1,2,3,null,5,null,4");
        List<Integer> res = rightSideView(root);
        for (Integer integer:res){
            System.out.println(integer);
        }
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.push(root);
        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left!=null){
                    queue.add(cur.left);
                }
                if (cur.right!=null){
                    queue.add(cur.right);
                }
                if (i==size-1){
                    res.add(cur.val);
                }
            }
        }
        return res;
    }
}
