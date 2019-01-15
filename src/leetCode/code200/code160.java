package leetCode.code200;

public class code160 {
    public static void main(String[] args) {

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode last = headB;
        while (last.next!=null){
            last = last.next;
        }

        last.next = headA;

        ListNode fast =headB.next.next , slow = headB.next;
        while (slow!=fast){
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = headB;
        while (fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }

    private static ListNode createLink1() {
        ListNode node1= new ListNode(4);
        ListNode node2= new ListNode(1);
        ListNode node3= new ListNode(8);
        ListNode node4= new ListNode(4);
        ListNode node5= new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        return node1;
    }

    private static ListNode createLink2() {
        ListNode node1= new ListNode(5);
        ListNode node2= new ListNode(0);
        ListNode node3= new ListNode(1);
        ListNode node4= new ListNode(8);
        ListNode node5= new ListNode(4);
        ListNode node6= new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        return node1;
    }
}
