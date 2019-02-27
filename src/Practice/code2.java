package Practice;

public class code2 {
// -1 -- 1->2->3->3->4->4->5

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode res = new ListNode(-1);
        res.next = head;

        ListNode temp = res;
        while (temp.next!=null){
            ListNode cur = temp.next;
            while (cur.next!=null && cur.val == cur.next.val){
                cur = cur.next;
            }

            if (cur == temp.next){
                temp = temp.next;
            }else {
                temp.next =cur.next;
            }
        }

        return res.next;
    }
}
