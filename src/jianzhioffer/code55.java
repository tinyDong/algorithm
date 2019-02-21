package jianzhioffer;

public class code55 {
    public static void main(String[] args) {

    }

    public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead ==null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        boolean hasLoop =false;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                hasLoop =true;
                break;
            }
        }
        if (!hasLoop){
            return null;
        }

        fast =pHead;
        while (fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
