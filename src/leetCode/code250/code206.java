package leetCode.code250;

public class code206 {

    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
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
