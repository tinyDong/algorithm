package leetCode;

//无重复字符的最长子串
//示例 1:
//
//输入: "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//示例 2:
//
//输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//示例 3:
//
//输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

import java.util.HashMap;

public class code3 {
    public static void main(String[] args) {

        String str = "pwwkew";

        Integer result = getNoRepeatLongestStr(str);
        System.out.println(result);
    }

    private static Integer getNoRepeatLongestStr(String str) {
        char[] chars = str.toCharArray();
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {
            HashMap<Character,String> map = new HashMap<>();
            for (int j = i; j <chars.length; j++) {
                if (map.containsKey(chars[j])){
                    maxLength = Math.max(maxLength,j-i);
                    break;
                }else {
                    map.put(chars[j],"");
                }
            }
        }
        return maxLength;
    }
}
