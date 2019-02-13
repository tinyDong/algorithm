package leetCode.code150;

public class code109 {


    public static void main(String[] args) {
        ListNode header =createLink();
        TreeNode root = sortedListToBST(header);
        System.out.println(root);
    }

    public static TreeNode sortedListToBST(ListNode head) {
        return helper(head,null);
    }

    private static TreeNode helper(ListNode head,ListNode tail) {
        if (head==null||head == tail){
            return null;
        }
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

    public static ListNode createLink() {
        ListNode root = new ListNode(-10);
        ListNode node1 = new ListNode(-3);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(9);
        root.next =node1;
        node1.next =node2;
        node2.next =node3;
        node3.next = node4;
        return root;
    }
}
