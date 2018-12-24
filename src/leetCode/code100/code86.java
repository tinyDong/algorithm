package leetCode.code100;

//给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
//
//你应当保留两个分区中每个节点的初始相对位置。
//
//示例:
//
//输入: head = 1->4->3->2->5->2, x = 3
//输出: 1->2->2->4->3->5

public class code86 {

    public static void main(String[] args) {
        ListNode head = createLink();
        head = partition(head,3);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static ListNode partition(ListNode head, int target) {
        ListNode before = new ListNode(-1);
        before.next = head;

        ListNode after = new ListNode(-1);

        ListNode first = before , second = after;
        while (first.next!=null){
            if (first.next.val>=target){
                second.next = first.next;
                second = second.next;

                first.next = first.next.next;
                second.next = null;
            }else {
                first = first.next;
            }
        }
        first.next = after.next;
        return before.next;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    private static ListNode createLink() {
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(4);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(2);
        ListNode node5= new ListNode(5);
        ListNode node6= new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        return node1;
    }
}
