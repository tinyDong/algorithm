package jianzhioffer;



import java.util.ArrayList;
import java.util.Stack;

public class code3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode ==null){
            return list;
        }
        Stack<Integer> stack = new Stack<>();

        while (listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
