package link;

public class LinkTest {

    private Node header;

    private Node createNode(int value){
        return new Node(value);
    }

    private void addNode(Node node){
        if (header==null){
            header = node;
        }else {
            Node temp = header;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    static class Node{
        int value;
        Node next;
        Node(int value1){
            value = value1;
        }

        Node(){}
    }

//    单链表反转
//    链表中环的检测
//    两个有序的链表合并
//    删除链表倒数第n个结点
//    求链表的中间结点

    public static void main(String[] args) {
        LinkTest link = new LinkTest();

        createLink(link);

        Node temp = link.header;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;

        }
        int n = 2;
//        Node temp1 = reserveLink(link.header,n);
//        Node temp1 =reverse(link.header);
        Node temp1 = findLastOne(link.header);
        while (temp1!=null){
            System.out.println(temp1.value);
            temp1 = temp1.next;

        }

    }


    // a-b-c-d-e
    //递归
    public static Node findLastOne(Node node){
        Node pre = null;
        if (node == null||node.next == null) {
            pre =node;
        }else {
            Node temp = findLastOne(node.next);
            node.next.next=node;
            node.next=null;
            pre = temp;
        }

        return pre;
    }


    //非递归
    public static Node reverse(Node node) {
        Node pre= null;
        while (node!=null){
            Node temp = node;
            node = node.next;
            temp.next=pre;
            pre=temp;
        }
        return pre;
    }

    //非递归1
    private static Node reserveLink(Node node, int n) {
        Node pre = null;
        while (node!=null){
            Node temp = node.next;
            node.next=pre;
            pre=node;
            node = temp;
        }
        return pre;
    }

    private static void createLink(LinkTest link) {
        Node node1 = link.createNode(3);
        Node node2 = link.createNode(1);
        Node node3 = link.createNode(4);
        Node node4 = link.createNode(9);
        Node node5 = link.createNode(8);
        Node node6 = link.createNode(7);

        link.addNode(node1);
        link.addNode(node2);
        link.addNode(node3);
        link.addNode(node4);
        link.addNode(node5);
        link.addNode(node6);

    }
}
