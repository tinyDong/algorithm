package link;

import java.util.HashMap;
import java.util.Map;

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


        LinkTest link1 = createLink();

        LinkTest link2 = createLink1();

//        Node n1 = link1.header;
//
//        Node n2 = link1.header;
//
//        n1.next = null;


//        Node temp1 = mergeLink(link1.header,link2.header);

        int n = 2;
//        Node temp1 = deletePointNode(link1.header,2);
//        Node temp1 = reserveLink(link.header,n);
        Node temp1 =reverse2(link1.header);
//        Node temp1 = findLastOne(link.header);
//        Node temp1 = findMidNode(link1.header);

        printNode(temp1);
//        Boolean isCycle=checkCycle(link1.header);
//
//        Node node = getMeetNod(link1.header);
//
//        System.out.println(node.value);

    }

    private static Node getMeetNod(Node header) {
        Map map = new HashMap();
        while (header != null) {
            if (map.containsKey(header)){
                return header;
            }else {
                map.put(header,header.value);
            }
            header = header.next;
        }
        return null;
    }


    private static Boolean checkCycle(Node node){
        Node fast = node;
        Node slow = node;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }

    private static Node deletePointNode(Node node, int n) {
        Node temp = node;
        for (int i = 1; i < n-1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        return temp;
    }

    private static Node findMidNode(Node node){
        if (node==null)return null;
        Node fast = node;
        Node slow = node;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next =null;
        return slow;
    }


    private static Node mergeLink(Node node1,Node node2){
        if (node1==null) return node2;
        if (node2==null) return node1;

        Node pre = null;
        if (node1.value>=node2.value){
            pre=node2;
            pre.next=mergeLink(node1,node2.next);
        }else {
            pre=node1;
            pre.next= mergeLink(node1.next,node2);
        }
        return pre;
    }

    //递归反转
    private static Node reverse1(Node node) {
        Node pre = null;
        if (node == null || node.next == null){
            pre = node;
        }else {
            Node temp = reverse1(node.next);
            node.next.next=node;
            node.next = null;
            pre =temp;
        }
        return pre;
    }

    //非递归反转
    private static Node reverse2(Node node){
        Node pre = null;
        while (node!=null){
            Node temp =node;
            node = node.next;
            temp.next = pre;
            pre = temp;
        }
        return pre;
    }

    private static void printNode(Node temp1){
        while (temp1 != null) {
            System.out.println(temp1.value);
            temp1 = temp1.next;

        }
    }



    private static LinkTest createLink() {
        LinkTest link = new LinkTest();
        Node node1 = link.createNode(1);
        Node node2 = link.createNode(3);
        Node node3 = link.createNode(5);
        Node node4 = link.createNode(7);
        Node node5 = link.createNode(9);
        Node node6 = link.createNode(11);

        link.addNode(node1);
        link.addNode(node2);
        link.addNode(node3);
        link.addNode(node4);
        link.addNode(node5);
        link.addNode(node6);
//        node6.next=node3;
        return link;
    }
    private static LinkTest createLink1() {
        LinkTest link = new LinkTest();
        Node node1 = link.createNode(2);
        Node node2 = link.createNode(4);
        Node node3 = link.createNode(6);
        Node node4 = link.createNode(8);
        Node node5 = link.createNode(10);
        Node node6 = link.createNode(12);

        link.addNode(node1);
        link.addNode(node2);
        link.addNode(node3);
        link.addNode(node4);
        link.addNode(node5);
        link.addNode(node6);
        return link;
    }
}
