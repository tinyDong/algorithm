package leetCode.code100;


//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//
//示例 1:
//
//输入: 1->1->2
//输出: 1->2
//示例 2:
//
//输入: 1->1->2->3->3
//输出: 1->2->3
public class code83 {

    public static void main(String[] args) {
        ListNode head = createLink();

        head = deleteDuplicates(head);

        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(-1);
        res.next=head;
        ListNode pre = res;
        while (pre.next!=null){
            ListNode cur = pre.next;
            if (cur.next!=null&& cur.next.val == cur.val){
                cur.next = cur.next.next;
            }
            pre = pre.next;
        }
        return res.next;
    }

     public static class ListNode {
         int val;
          ListNode next;
          ListNode(int x) { val = x; }
    }


    private static ListNode createLink() {
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(1);
        ListNode node3= new ListNode(2);
        ListNode node4= new ListNode(3);
        ListNode node5= new ListNode(3);
        ListNode node6= new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        return node1;
    }

}
