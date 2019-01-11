package leetCode.code150;

//示例 1:
//给定链表 1->2->3->4, 重新排列为 1->4->2->3.

//示例 2:
//给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
public class code143 {

    public static void main(String[] args) {
        ListNode head = createLink();

        reorderList(head);

        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }


    public static void reorderList(ListNode head) {
        if (head ==null){
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!=null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        fast = reservedList(fast);

        ListNode cur = head;
        while (cur!=null&&fast!=null){
            ListNode temp = cur.next;
            cur.next = fast;
            fast = fast.next;
            cur.next.next = temp;
            cur = cur.next.next;
        }
    }

    private static ListNode reservedList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode pre = null;
        while (head != null){
            ListNode temp = head;
            head = head.next;
            temp.next =pre;
            pre =temp;
        }
        return pre;
    }


    private static ListNode createLink() {
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(4);
        ListNode node5= new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        return node1;
    }


}
