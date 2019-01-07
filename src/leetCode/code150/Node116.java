package leetCode.code150;

public class Node116 {


    public static void main(String[] args) {

    }

    public void connect2(TreeLinkNode root) {

       TreeLinkNode pre = root;
       TreeLinkNode cur = null;
       while (pre.left!=null){
          cur = pre;
          while (cur!=null){
              cur.left.next = cur.right;
              if (cur.next!=null){
                  cur.right.next = cur.next.left;
              }
              cur = cur.next;
          }
          pre = pre.left;
       }
    }



    public void connect1(TreeLinkNode root) {
        if (root == null || root.left == null)
            return;
        root.left.next = root.right;
        if (root.next!=null){
            root.right.next = root.next.left;
        }
        connect1(root.left);
        connect1(root.right);
    }

    public class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
    }
}
