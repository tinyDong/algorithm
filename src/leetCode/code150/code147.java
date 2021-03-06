package leetCode.code150;

//示例 1：
//输入: 4->2->1->3
//输出: 1->2->3->4
//示例 2：
//
//输入: -1->5->3->4->0
//输出: -1->0->3->4->5
public class code147 {
    public static void main(String[] args) {

        ListNode head = createLink();
        head = insertionSortList(head);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        // head~pre是排好序的部分
        ListNode pre = head;
        // 第一个元素默认是有序的
        ListNode cur = head.next;
        while (cur != null) {
            // 寻找插入位置
            ListNode insertPre = findInsertIndexPre(dummyHead, cur);
            // 这种情况表示当前节点不需要换位置
            if (insertPre == pre) {
                pre = cur;
                cur = cur.next;
            } else {
                // cur的需要插入到insertPre后面的位置
                pre.next = cur.next;
                cur.next = insertPre.next;
                insertPre.next = cur;

                // 移动cur
                cur = pre.next;
            }
        }

        return dummyHead.next;
    }

    /**
     * 查找cur要插入位置的前一个节点
     * @param head
     * @param cur
     * @return
     */
    private static ListNode findInsertIndexPre(ListNode head, ListNode cur ){
        while (head.next != cur) {
            if (head.next.val >= cur.val) {
                return head;
            }
            head = head.next;
        }
        return head;
    }

    private static ListNode createLink() {
        ListNode node1= new ListNode(2);
        ListNode node2= new ListNode(4);
        ListNode node3= new ListNode(3);
        ListNode node4= new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node1;
    }
}
