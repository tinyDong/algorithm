package leetCode.code50;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class code20 {
//    给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//    "([)]"
    public static void main(String[] args) {

        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();

        Stack stack = new Stack();

        Map map = new HashMap();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for (char c: chars){
            if (map.containsKey(c)){
                stack.push(c);
            }else{
                if (!map.get(stack.pop()).equals(c)){
                    return false;
                }
            }

        }
        if (!stack.isEmpty()){
            return false;
        }

        return true;
    }
}
