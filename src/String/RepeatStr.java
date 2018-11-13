package String;

//String str = "abaddcc";
// aabbaa
//最长回文字符串
public class RepeatStr {
    public void test(String str){
        if (str==null){
            return;
        }
        String maxStr="";

        char[] chars=str.toCharArray();
        int length = str.length();
        int start = 0 , end = start;

        while (start<length-1){
            String subStr=this.findMax(str,start,start+1);
            maxStr=maxStr.length()>subStr.length()?maxStr:subStr;

            String subStr1=this.findMax(str,start,start);
            maxStr=maxStr.length()>subStr.length()?maxStr:subStr1;

            start++;
        }

        System.out.println(maxStr);
    }

    private String findMax(String str,int start,int end){
        String subStr = "";
        char[] chars = str.toCharArray();
        while (start>=0&&end<chars.length&&chars[start] == chars[end]){
            subStr=subStr.length()>str.substring(start,end+1).length()?subStr:str.substring(start,end+1);
            end++;
            start--;
        }

        return subStr;
    }

    public static void main(String[] args) {
        String tsetTr = "abbadddddc";
        new RepeatStr().test(tsetTr);

        String result2= longestPalindromeDynamic(tsetTr);
        System.out.println("========"+result2);
    }

//    https://blog.csdn.net/qq_26286193/article/details/80291718
    private static String longestPalindromeDynamic(String s1)
    {
        char[] chars = s1.toCharArray();

        int[][] dp = new int[s1.length()][s1.length()];
        for (int i = 0; i < chars.length; i++) {
            dp[i][i]=1;
        }

        int start = 0 ,max =1;

        for (int i = 0; i < chars.length; i++) {

            for (int j = i-1; j >0 ; j--) {
                if (chars[i]==chars[j]){
                    if (i-j==1){
                        dp[j][i]=2;
                    }else {
                        if (dp[j+1][i-1]>0){
                            dp[j][i] = dp[j+1][i-1] + 2;
                        }else {
                            dp[j][i]=0;
                        }
                    }
                }else {
                    dp[j][i]=0;
                }

                if (dp[j][i]>max){
                    max = dp[j][i];
                    start =j;
                }
            }
        }

        return String.copyValueOf(chars,start,max);
    }
}
