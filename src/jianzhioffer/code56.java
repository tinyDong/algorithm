package jianzhioffer;

public class code56 {
//    例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
    public static void main(String[] args) {
        ListNode head = createLink1();

        ListNode res = deleteDuplication(head);
        System.out.println(res);
    }

    public static ListNode deleteDuplication(ListNode pHead)
    {
        ListNode res = new ListNode(-1);
        res.next = pHead;
        ListNode pre = res;
        while (pre.next!=null){
            ListNode cur = pre.next;
            while (cur.next!=null &&cur.val == cur.next.val){
                cur = cur.next;
            }
            if (pre.next == cur){
                pre= pre.next;
            }else {
                pre.next = cur.next;
            }
        }
        return res.next;
    }

    private static ListNode createLink1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        return node1;
    }
}
