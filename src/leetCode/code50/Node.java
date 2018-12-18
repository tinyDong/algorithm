package leetCode.code50;

public class Node {
    public Node next ;
    public Integer value ;
    public Node(Integer value){
        this.value = value;
    }


    public static Node createLink() {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        root.next =node1;
        node1.next =node2;
        node2.next =node3;
        node3.next = node4;
        return root;
    }

    public static void printNode(Node header){
        while (header!=null){
            System.out.println(header.value);
            header = header.next;
        }
    }



}
