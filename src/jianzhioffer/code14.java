package jianzhioffer;

public class code14 {
    public static void main(String[] args) {

    }

    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            if (cur==null){
                return null;
            }
            cur = cur.next;
        }
        ListNode res = head;
        while (cur!=null){
            cur = cur.next;
            res = res.next;
        }
        return res;
    }
}
