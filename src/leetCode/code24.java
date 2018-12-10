package leetCode;

//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
//
//示例:
//
//给定 1->2->3->4, 你应该返回 2->1->4->3.
//你的算法只能使用常数的额外空间。
//你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
public class code24 {

    public static void main(String[] args) {

        Node header = Node.createLink();
//        header = swapPairs1(header);
        header = swapPairs2(header);
        while (header!=null){
            System.out.println(header.value);
            header =header.next;
        }
    }


    public static Node swapPairs2(Node head) {
        Node res = new Node(-1);
        res.next = head;
        Node pre_head = res;
        while (head != null && head.next != null) {
            Node Node1 = head;
            Node Node2 = head.next.next;
            res.next = head.next;
            res = res.next;
            res.next = Node1;
            Node1.next = Node2;
            res = res.next;
            head = Node2;

        }
        return pre_head.next;
    }
//    private static Node swapPairs2(Node header) {
//
//        Node cur = new Node(0);
//        cur.next = header;
//
//        while (cur!=null&&cur.next!=null){
//            Node second = cur.next;
//            cur.next=cur.next.next;
//            second.next=cur;
//            cur = second.next.next;
//
//        }
//        return header;
//    }

    public static Node swapPairs1(Node head) {
        if (head==null||head.next==null){
            return head;
        }

        Node temp  =head.next;
        head.next=head.next.next;
        temp.next=head;

        temp.next.next= swapPairs1(temp.next.next);
        return temp;
    }





}
