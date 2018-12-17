package leetCode.code100;
//http://www.cnblogs.com/grandyang/p/4355505.html

//给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
//
//示例 1:
//
//输入: 1->2->3->4->5->NULL, k = 2
//输出: 4->5->1->2->3->NULL
//解释:
//向右旋转 1 步: 5->1->2->3->4->NULL
//向右旋转 2 步: 4->5->1->2->3->NULL
//示例 2:
//
//输入: 0->1->2->NULL, k = 4
//输出: 2->0->1->NULL
//解释:
//向右旋转 1 步: 2->0->1->NULL
//向右旋转 2 步: 1->2->0->NULL
//向右旋转 3 步: 0->1->2->NULL
//向右旋转 4 步: 2->0->1->NULL

import leetCode.code50.Node;

public class code61 {
    public static void main(String[] args) {
        Node head = Node.createLink();
//        head = rotateRight(head,2);
        head = rotateRight1(head,4);
        Node.printNode(head);
    }


    public static Node rotateRight1(Node head, int k) {
        Node cur = head;
        int n =1;
        while (cur.next!=null){
            ++n;
            cur =cur.next;
        }
        cur.next = head;

        int m = n -k%n;
        for (int i = 0; i < m ; i++) {
            cur = cur.next;

        }
        Node temp =cur.next;
        cur.next=null;
        return temp;
    }

    public static Node rotateRight(Node head, int n) {
        Node res = head;
        for (int i = 0; i < n; i++) {
            res= getAndRemoveLastNode(res);
        }
        return res;
    }

    private static Node getAndRemoveLastNode(Node head) {
        Node temp = head;
        while (temp!=null&& temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        Node res = temp;
        while (res.next!=temp){
            res =res.next;
        }
        res.next =null;
        return temp;
    }

}
