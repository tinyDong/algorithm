package jianzhioffer;

import java.util.Stack;

public class TwoStackImplQueue9 {

    private static Stack<Integer> in = new Stack<>();

    private static Stack<Integer> out = new Stack<>();

//    用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。
    public static void main(String[] args) {

        in(1);
        in(2);
        in(3);

        System.out.println(out());
//        System.out.println(out());
//        System.out.println(out());

        in(4);
        System.out.println(out());
    }


    private static void in(int i){
        in.push(i);

    }

    private static int out(){
        if (out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
        if (out.isEmpty()){
            return 0;
        }
        return out.pop();
    }


}
