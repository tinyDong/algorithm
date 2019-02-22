package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class code60 {


    public static void main(String[] args) {

    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot ==null){
            return res;
        }

        LinkedList<TreeNode> queue = new LinkedList();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left!=null){
                    queue.add(temp.left);
                }
                if (temp.right!=null){
                    queue.add(temp.right);
                }
                arrayList.add(temp.val);
            }
            res.add(arrayList);
        }
        return res;
    }
}
