package String;


import java.util.ArrayList;

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

public class String3 {
    public void find(){

    }


    public static void main(String[] args) {
        System.out.println(new String3().lengthOfLongestSubstring("axcbbcbcabx"));
    }

    private int lengthOfLongestSubstring(String str) {
        if (str==null||str.length()==0){
            return 0;
        }

        boolean[] chars= new boolean[256];
        int start = 0, end=0 , maxLength = 0;

        while (start<str.length()){

            while (end<str.length()&&!chars[str.charAt(end)]){
                chars[str.charAt(end)]=true;
                maxLength=Math.max(maxLength,end-start+1);
                end++;
            }
            chars[str.charAt(start)]=false;
            start++;
        }
        return maxLength;
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
