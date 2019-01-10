package leetCode.code150;

public class code142 {

    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {


        ListNode fast = head.next.next;
        ListNode slow = head.next;

        while (fast!=null&&slow!=null&&fast!=slow){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast=head;

        while (fast!=null&&slow!=null&&fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
