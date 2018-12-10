package leetCode;

import java.util.ArrayList;
import java.util.List;

public class code22 {
// 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
//
//例如，给出 n = 3，生成结果为：
//
//[
//"((()))",
//"(()())",
//"(())()",
//"()(())",
//"()()()"
// ]
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(3));
    }


//    public static List<String> generateParenthesis(int n) {
//        List<String> list=new ArrayList<>();
//        String str= "";
//        generate(list,str,n,n);
//        return list;
//    }
//
//    private static void generate(List<String> res, String str, int left, int right) {
//        System.out.println(str);
//        if (left==0&&right==0){
//            res.add(str);
//        }
//        if (left>0){
//            generate(res,str+'(',left-1,right);
//        }
//        if (right>left){
//            generate(res,str+')',left,right-1);
//        }
//    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        helper(n, n, "", res);
        return res;
    }
    static void helper(int left, int right, String out, List<String> res) {
        System.out.println(out);
        if (left < 0 || right < 0 || left > right){
            return;
        }

        if (left == 0 && right == 0) {
            res.add(out);
            return;
        }
        helper(left - 1, right, out + "(", res);
        helper(left, right - 1, out + ")", res);
    }

}
