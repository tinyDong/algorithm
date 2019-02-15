package jianzhioffer;

public class code36 {

    public static void main(String[] args) {

    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        ListNode last = pHead2;
        while (last.next!=null){
            last = last.next;
        }
        last.next =pHead2;
        ListNode fast = pHead1.next.next, slow = pHead1.next;


        while (fast!=slow){
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = pHead1;

        while (fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
