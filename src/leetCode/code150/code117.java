package leetCode.code150;

public class code117 {


    public static void main(String[] args) {

    }

    public void connect(TreeLinkNode root) {
        if (root==null){
            return;
        }
        TreeLinkNode next = null;
        if (root.left!=null){
            if (root.right!=null){
                root.left.next = root.right;
            }else {
                next = root.next;
                while (next!=null){
                    if (next.left!=null){
                        root.left.next = next.left;
                        break;
                    }else if (next.right != null){
                        root.left.next = next.right;
                        break;
                    }
                    next = next.next;
                }
            }
        }

        if (root.right!=null){
            next = root.next;
            while (next != null){
                if (next.left!=null){
                    root.right.next = next.left;
                    break;
                }

                if (next.right !=null){
                    root.right.next = next.right;
                    break;
                }
                next = next.next;
            }
        }
        connect(root.left);
        connect(root.right);

    }

    public class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
    }


}
