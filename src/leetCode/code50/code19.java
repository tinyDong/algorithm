package leetCode.code50;
//删除链表的倒数第N个节点
//给定一个链表: 1->2->3->4->5, 和 n = 2.

//当删除了倒数第二个节点后，链表变为 1->2->3->5.
public class code19 {

    public static void main(String[] args) {
        Node header = createLink();
        int n = 2;
        removeNthFromEnd(header,n);
        while (header!=null){
            System.out.println(header.value);
            header=header.next;
        }
    }

    private static void removeNthFromEnd(Node header, int n) {
        Node fast = header;
        for (int i = 0; i < n+1; i++) {
            fast =fast.next;
        }

        Node slow = header;
        while (fast!=null&&fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next=slow.next.next;
    }

    private static Node createLink() {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        root.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        return root;
    }
}
