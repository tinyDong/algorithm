package dynamicProgramming;

import java.util.Stack;

//最长公共子序列(Longest Common Subsequence/
//对于序列S和T，求它们的最长公共子序列。例如X={A,B,C,B,D,A,B}，Y={B,D,C,A,B,A}则它们的lcs是{B,C,B,A}和{B,D,A,B}。求出一个即可。
//https://blog.csdn.net/qq_31881469/article/details/77892324
//https://blog.csdn.net/hrn1216/article/details/51534607
public class lcs {

    public static void main(String[] args) {

        String str1 = "ABCBDAB";
        String str2 = "BDCABA";

        getLCS(str1.toCharArray(),str2.toCharArray());
//        System.out.println();

    }

    private static void getLCS(char[] char1, char[] char2){

        int[][] dp = new int[char1.length+1][char2.length+1];

        for (int i = 0; i <= char1.length; i++) {
            for (int j = 0; j <= char2.length; j++) {
                if (i==0||j==0){
                    dp[i][j]=0;
                }else if (char1[i-1]==char2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println("最长长度"+dp[char1.length][char2.length]);


        Stack stack = new Stack();


        int i = char1.length-1;
        int j = char2.length-1;

        while (i>=0&&j>=0){
            if (char1[i]==char2[j]){
                stack.push(char1[i]);
                i--;
                j--;
            }else {
                if (dp[i+1][j]>dp[i][j+1]){
                    i--;
                }else {
                    j--;
                }
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}













//        while((i >= 0) && (j >= 0)){
//                if(char1[i] == char2[j]){//字符串从后开始遍历，如若相等，则存入栈中
//                stack.push(char1[i]);
//                i--;
//                j--;
//                }else{
//                //如果字符串的字符不同，则在数组中找相同的字符，注意：数组的行列要比字符串中字符的个数大1，因此i和j要各加1
//                if(dp[i+1][j] > dp[i][j+1]){
//                j--;
//                }else{
//                i--;
//                }
//                }
//                }
