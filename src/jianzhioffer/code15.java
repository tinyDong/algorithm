package jianzhioffer;

public class code15 {
    public static void main(String[] args) {

    }

    public ListNode ReverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode pre = null;

        while (head!=null){
            ListNode temp = head;
            head = head.next;
            temp.next = pre;
            pre = temp;
        }
        return pre;
    }
}
