package leetCode.code200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class code173 {

    Queue<TreeNode> stack ;

    public static void main(String[] args) {
        TreeNode root = TreeUtils.stringToTreeNode("7,3,15,null,null,9,20");
        code173 iterator = new code173(root);
           // 返回 3
        System.out.println(iterator.next() );
           // 返回 7
        System.out.println(iterator.next() );
         // 返回 true
        System.out.println(iterator.hasNext());
           // 返回 9
        System.out.println(iterator.next() );
         // 返回 true
        System.out.println(iterator.hasNext());
           // 返回 15
        System.out.println(iterator.next() );
        // 返回 true
        System.out.println(iterator.hasNext() );
           // 返回 20
        System.out.println(iterator.next() );
        ; // 返回 false
        System.out.println(iterator.hasNext());

    }

    public code173(TreeNode root) {
       this.stack = new LinkedList<>();

       Stack<TreeNode> temp =new Stack<>();
       while (!temp.isEmpty() || root!=null){
           if (root!=null){
               temp.push(root);
               root = root.left;
           }else {
               root = temp.pop();
               this.stack.add(root);
               root = root.right;
           }
       }
    }

    /** @return the next smallest number */
    public int next() {
        return stack.poll().val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
