package leetCode;

import java.util.Stack;

//两数相加
//输入：(2 -> 5 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 1 -> 8
//原因：352 + 465 = 817
public class code2 {


    public static Node addTwoNumbers2(Node l1, Node l2){
        //定义满十进一的数
        int num = 0;
        //定义一个ListNode，作为链表头
        Node proNode = new Node(0);
        //定义一个ListNode，接受两数的和
        Node currentNode = new Node(0);

        proNode.next = currentNode;

        while (l1!=null||l2!=null||num!=0){

            int sum = (l1==null?0:l1.value) + (l2==null?0:l2.value) + num;

            sum = sum/10;

            int curValue = sum%10;
            currentNode.value= curValue;

            l1 = l1 ==null? l1:l1.next;
            l2 = l2 ==null? l2:l2.next;
            while (l1!=null||l2!=null||num!=0){
                currentNode.next = new Node(0);
                currentNode  = currentNode.next;
            }
        }

        return proNode.next;
    }


    public static void main(String[] args) {

        Node root1 = createLink1();
        Node root2 = createLink2();

//        Node resultRoot = addTwoNumbers1(root1,root2);
        Node resultRoot = addTwoNumbers2(root1,root2);
        while (resultRoot!=null){
            System.out.println(resultRoot.value);
            resultRoot =resultRoot.next;
        }
    }

    private static Node addTwoNumbers1(Node root1, Node root2) {
        Integer num1 = getNumFormRoot(root1);
        Integer num2 = getNumFormRoot(root2);

        Integer result = num1+num2;

        String resultStr = result.toString();

        Node resultRoot = new Node(Integer.valueOf(resultStr.substring(resultStr.length()-1,resultStr.length())));
        Node cur =resultRoot;
        for (int i =resultStr.length()-1; i >=1; i--) {
            cur.next=new Node(Integer.valueOf(resultStr.substring(i-1,i)));
            cur=cur.next;
        }
        return resultRoot;
    }

    private static Integer getNumFormRoot(Node root1) {
        Stack<Integer> stack1 = new Stack<>();
        while (root1!=null){
            stack1.push(root1.value);
            root1 = root1.next;
        }
        StringBuilder str1= new StringBuilder();
        while (!stack1.isEmpty()){
            str1.append(stack1.pop());
        }
        return Integer.valueOf(str1.toString());
    }

    private static Node createLink2() {
        Node root = new Node(2);
        Node node1 = new Node(5);
        Node node2 = new Node(3);
        root.next =node1;
        node1.next = node2;
        return root;
    }

    private static Node createLink1() {
        Node root = new Node(5);
        Node node1 = new Node(6);
        Node node2 = new Node(4);
        root.next =node1;
        node1.next = node2;
        return root;
    }


    private static class Node{
        Node next ;
        Integer value ;
        public Node(Integer value){
            this.value = value;
        }
    }
}
