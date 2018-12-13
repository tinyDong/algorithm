package leetCode;

import java.util.ArrayList;

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

    private static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        String temp ="";
        dfs(n,n,temp,res);
        return res;
    }

    private static void dfs(int left, int right, String temp, ArrayList<String> res) {
        if (left==0 &&right ==0){
            res.add(temp);
            return;
        }
        if (left<0||right<0||right<left){
            return;
        }
        dfs(left-1,right,temp+"(",res);
        dfs(left,right-1,temp+")",res);

    }


}
