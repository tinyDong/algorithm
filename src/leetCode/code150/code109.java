package leetCode.code150;

public class code109 {


    public static void main(String[] args) {
        System.out.println(Short.parseShort("1"));

    }

    public static TreeNode sortedListToBST(ListNode head) {


        return helper(head,null);
    }

    private static TreeNode helper(ListNode head,ListNode tail) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=tail && fast.next!=tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode node = new TreeNode(slow.val);
        node.left=helper(head,slow);
        node.right =helper(slow.next,tail);
        return node;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
}
