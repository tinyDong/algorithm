package Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class code4 {

    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
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
                if (i ==size-1){
                    res.add(cur.val);
                }
            }
        }
        return res;
    }
}
