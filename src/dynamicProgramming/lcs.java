package dynamicProgramming;

//最长公共子序列(Longest Common Subsequence/
//对于序列S和T，求它们的最长公共子序列。例如X={A,B,C,B,D,A,B}，Y={B,D,C,A,B,A}则它们的lcs是{B,C,B,A}和{B,D,A,B}。求出一个即可。
public class lcs {

    public static void main(String[] args) {

        String str1 = "ABCBDAB";
        String str2 = "BDCABA";

        System.out.println(getLCS(str1.toCharArray(),str2.toCharArray()));

    }

    private static int getLCS(char[] char1, char[] char2){

        int[][] dp = new int[char1.length][char2.length];

        for (int i = 0; i < char1.length; i++) {
            if (char2[0]==char1[i]){
                dp[i][0]=1;
            }else {
                if (i==0){
                    dp[i][0]=0;
                }else {
                    dp[i][0]=dp[i-1][0];
                }

            }
        }

        for (int i = 0; i < char2.length; i++) {
            if (char1[0]==char2[i]){
                dp[0][i]=1;
            }else {
                if (i==0){
                    dp[0][i]=0;
                }else {
                    dp[0][i]=dp[0][i-1];
                }

            }
        }

        for (int i = 1; i <char1.length; i++) {

            for (int j = 1; j < char2.length; j++) {
                if (char1[i]==char2[j]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[char1.length-1][char2.length-1];
    }

}
