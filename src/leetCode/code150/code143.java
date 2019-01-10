package leetCode.code150;

//示例 1:
//给定链表 1->2->3->4, 重新排列为 1->4->2->3.

//示例 2:
//给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3.
public class code143 {

    public static void main(String[] args) {


    }


    public void reorderList(ListNode head) {


    }

    private ListNode reservedList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode temp = cur.next;
            cur = cur.next;
            temp.next =pre;
            pre =temp;
        }
       return head;
    }


}
