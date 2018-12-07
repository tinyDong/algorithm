package leetCode;
//合并两个有序链表
public class code21 {

    public static void main(String[] args) {
        Node header1 = createLink1();
        Node header2 = createLink2();


        Node res = mergeLink(header1,header2);
        while (res!=null){
            System.out.println(res.getValue());
            res =res.getNext();
        }
    }

    private static Node mergeLink(Node header1, Node header2) {

    }


    private static Node createLink1() {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(4);
        root.setNext(node1);
        node1.setNext(node2);
        return root;
    }


    private static Node createLink2() {
        Node root = new Node(1);
        Node node1 = new Node(3);
        Node node2 = new Node(4);
        root.setNext(node1);
        node1.setNext(node2);
        return root;
    }
}
