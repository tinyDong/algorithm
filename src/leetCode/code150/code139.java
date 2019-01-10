package leetCode.code150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code139 {
    public static void main(String[] args) {
        System.out.println(wordBreak("leetcode", new ArrayList<>(Arrays.asList("leet", "code"))));
    }

    public static boolean wordBreak(String str, List<String> wordDict) {
        int n = str.length();
        if (wordDict.size()==0){
            return false;
        }
        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j]&&wordDict.contains(str.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}







//    // 可以类比于背包问题
//    int n = s.length();
//    // memo[i] 表示 s 中以 i - 1 结尾的字符串是否可被 wordDict 拆分
//    boolean[] memo = new boolean[n + 1];
//        memo[0] = true;
//                for (int i = 1; i <= n; i++) {
//                for (int j = 0; j < i; j++) {
//        if (memo[j] && wordDict.contains(s.substring(j, i))) {
//        memo[i] = true;
//        break;
//        }
//        }
//        }
//        return memo[n];
