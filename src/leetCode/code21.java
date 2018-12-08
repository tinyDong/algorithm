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
        if (header1==null){
            return header2;
        }
        if (header2==null){
            return header1;
        }
        Node temp = null;
        if (header1.getValue()<=header2.getValue()){
            temp=header1;
            temp.setNext(mergeLink(header1.getNext(),header2));
        }else {
            temp=header2;
            temp.setNext(mergeLink(header2.getNext(),header1));
        }
        return temp;
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
