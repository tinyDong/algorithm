package jianzhioffer;

import java.util.Stack;

public class code62 {
    int index = 0;
    public static void main(String[] args) {

    }

    public int kthSmallest1(TreeNode root, int k) {
      int res = 0;
      if (root ==null){
          return res;
      }
      res = kthSmallest1(root.left,k);
      if (res ==index){
          return res;
      }

      if (++index == k){
          return root.val;
      }

      return  kthSmallest1(root.right,k);

    }

    public int kthSmallest(TreeNode root, int k) {
        if (root == null){
            return -1;
        }
        int index = 0;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty()||root !=null){
           if(root !=null){
               stack.push(root);
               root =root.left;
           }else {
               if (index == k-1){
                   break;
               }
               root = stack.pop();
               index++;
               root = root.right;
           }
        }
        return stack.pop().val;
    }


}
