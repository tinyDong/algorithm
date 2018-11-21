package dynamicProgramming;

public class longCommonSubString {

//   最长子字符串 比如输入两个字符串BDCABA和ABCBDAB的最长公共字符串有BD和AB，它们的长度都是2
    public static void main(String[] args) {
        String str1 = "ABCBDAB";
        String str2 = "BDCABA";

        lcss(str1.toCharArray(),str2.toCharArray());

    }

    public static void lcss(char[] char1, char[] char2){

        int[][] dp = new int[char1.length+1][char2.length+1];
        int max = 0;
        int maxi = 0;
        for (int i = 0; i <= char1.length; i++) {
            for (int j = 0; j <= char2.length; j++) {
                if (i==0||j==0){
                    dp[i][j] = 0;
                }else if (char1[i-1]==char2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if (dp[i][j]>max){
                        max = dp[i][j];
                        maxi=i-1;
                    }
                }else {
                    dp[i][j]=0;
                }
            }
        }
        System.out.println(max);

        for (int i = maxi; i >0 ; i--) {
            System.out.println(char1[i]);
        }
    }

}
