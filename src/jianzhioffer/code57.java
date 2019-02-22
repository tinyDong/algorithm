package jianzhioffer;



public class code57 {

    public static void main(String[] args) {

    }

    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right!=null){
            TreeLinkNode next = pNode.right;
            while (next.left!=null){
                next = next.left;
            }
            return next;
        }else {
            while (pNode.next !=null){
                TreeLinkNode next = pNode.next;
                if (pNode == next.left){
                    return next;
                }
                pNode = pNode.next;
            }
        }
        return null;
    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }
}
