package leetCode.code100;

//示例 1:
//
//输入: 1->2->3->3->4->4->5
//输出: 1->2->5
//示例 2:
//
//输入: 1->1->1->2->3
//输出: 2->3

public class code82 {


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
        res.next = head;
        ListNode pre = res;
        while (pre.next!=null){
            ListNode cur = pre.next;
            while (cur.next!=null&&cur.val == cur.next.val){
                cur = cur.next;
            }
            if(cur!=pre.next){
                pre.next =cur.next;
            }else {
                pre = pre.next;
            }
        }
        return res.next;
    }

    private static ListNode createLink() {
        ListNode node1= new ListNode(1);
        ListNode node2= new ListNode(2);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(3);
        ListNode node5= new ListNode(4);
        ListNode node6= new ListNode(4);
        ListNode node7= new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        return node1;
    }



    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

}
