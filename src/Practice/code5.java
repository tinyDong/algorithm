package Practice;

public class code5 {
    public static void main(String[] args) {

    }


    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 ==null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        ListNode res = new ListNode(-1);
        ListNode cur = res;
        ListNode t1 = l1;
        ListNode t2 = l2;
        while (t1!=null && t2 != null){
            if (t1.val <= t2.val){
                cur.next = t1;
                t1 = t1.next;
            }else {
                cur.next = t2;
                t2 = t2.next;
            }
            cur = cur.next;
        }

        if (t1 ==null){
            cur.next = t2;
        }
        if (t2 ==null){
            cur.next = t1;
        }

        return res.next;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 ==null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode cur =l1;
        if (l1.val<=l2.val){
            cur =l1;
            cur.next = mergeTwoLists(l1.next,l2);
        }else {
            cur = l2;
            cur.next = mergeTwoLists(l1,l2.next);
        }

        return cur;
    }
}
