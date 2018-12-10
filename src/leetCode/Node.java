package leetCode;

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
        root.next =node1;
        node1.next =node2;
        node2.next =node3;
        return root;
    }

}
