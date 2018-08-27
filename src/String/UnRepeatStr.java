package String;


//3. 无重复字符的最长子串
//给定一个字符串，找出不含有重复字符的最长子串的长度。
//
//        示例：
//
//        给定 "abcabcbcabx" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
//
//        给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
//
//        给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UnRepeatStr {

    public static void main(String[] args) {
        System.out.println(new UnRepeatStr().lengthOfLongestSubstring("axcebpipbcbcabx"));
    }

    private int lengthOfLongestSubstring(String str) {
        if (str==null||str.length()==0){
            return 0;
        }

        char[] chars=str.toCharArray();
        HashMap<Object,Boolean> map = new HashMap();
        int start =0 ,end =start;
        String subStr="";

        while (start<chars.length){
            while (end<chars.length&&(map.get(chars[end])==null || !map.get(chars[end]))){
                map.put(chars[end],true);
                end++;
                subStr=subStr.length()>str.substring(start,end).length()?subStr:str.substring(start,end);
            }
            map.remove(chars[start]);
            start++;
        }
        System.out.println(subStr+"==="+subStr.length());
        return 0;
    }
















//    public int lengthOfLongestSubstring(String s) {
//        if (s == null || s.length() == 0) {
//            return 0;
//        }
//        boolean[] chars = new boolean[256]; // 256 ASCII code
//
//        int rst = 0;
//        int start = 0;
//        int end = 0;
//        while (start < s.length()) {
//            while (end < s.length() && !chars[s.charAt(end)]) {
//                System.out.println(end+""+chars[s.charAt(end)]);
//                chars[s.charAt(end)] = true;
//                rst = Math.max(rst, end - start + 1);
//                end++;
//            }
//            System.out.println("====");
//            chars[s.charAt(start)] = false;
//            start++;
//        }
//        return rst;
//    }
}
