package newCoder.queueAndStack;

import java.util.Stack;

public class code2 {
    private static Stack<Integer> stackIn = new Stack<>();
    private static Stack<Integer> stackOut = new Stack<>();

    public static void main(String[] args) {


    }


    private static void add(Integer num){
        stackIn.push(num);
    }

    private static Integer pop(){

        if (stackOut.isEmpty()){
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.pop();
    }

    private static Integer peek(){
        if (!stackOut.isEmpty()){
            return stackOut.peek();
        }
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }

        return stackOut.peek();
    }
}
