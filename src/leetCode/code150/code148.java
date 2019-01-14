package leetCode.code150;


public class code148 {

    public static void main(String[] args) {
        ListNode head = createLink();
        head = sortList(head);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static ListNode sortList(ListNode head) {

        return mergeList(head);
    }

    private static ListNode mergeList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slow = head,fast = head,pre = head;
        while (fast!=null&&fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
        pre.next = null;
        ListNode left  = mergeList(head);
        ListNode right = mergeList(slow);
        return merge(left,right);
    }

    private static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null)return l2;
        if (l2 == null) return l1;
        if (l1.val<l2.val){
            l1.next = merge(l1.next,l2);
            return l1;
        }else {
            l2.next = merge(l1,l2.next);
            return l2;
        }
    }

    private static ListNode createLink() {
        ListNode node1= new ListNode(2);
        ListNode node2= new ListNode(4);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node1;
    }
}
