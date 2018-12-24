package leetCode.code100;

//反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
//
//说明:
//1 ≤ m ≤ n ≤ 链表长度。
//
//示例:
//
//输入: 1->2->3->4->5->NULL, m = 2, n = 4
//输出: 1->4->3->2->5->NULL
public class code92 {

    public static void main(String[] args) {
        ListNode head = createLink();
        int m = 2,n =4;
        head = reverseBetween(head,m,n);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode pre = res;
        for (int i = 0; i < m-1; i++) {
            pre =pre.next;
        }
        ListNode first = pre;
        ListNode last = pre.next;
        pre = pre.next;
        ListNode temp =null;
        for (int i = 0; i < n - m+1; i++) {
            ListNode cur = pre;
            pre =pre.next;
            cur.next = temp;
            temp =cur;
        }
        first.next = temp;
        last.next = pre;
        return res.next;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }


    private static ListNode createLink() {
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(4);
        ListNode node5= new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        return node1;
    }
}
