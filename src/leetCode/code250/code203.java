package leetCode.code250;

public class code203 {
    public static void main(String[] args) {
        ListNode head = createLink1();

        ListNode res = removeElements(head,3);
        System.out.println(res.val);
    }

    public static ListNode removeElements(ListNode head, int val) {

        if (head==null){
            return null;
        }
        ListNode slow = head;

        while (slow.next!=null && slow.next.val!=val){
            slow = slow.next;
        }
        if (slow.next==null){
            return null;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return temp;
    }

    private static ListNode createLink1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        return node1;
    }
}
