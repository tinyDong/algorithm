package leetCode;
//示例 1:
//
//输入: haystack = "hello", needle = "ll"
//输出: 2
//示例 2:
//
//输入: haystack = "aaaaa", needle = "bba"
//输出: -1


import java.util.Arrays;

//https://www.cnblogs.com/yjiyjige/p/3263858.html
//https://www.cnblogs.com/leavescy/archive/2016/09/19/5884306.html
//http://www.ruanyifeng.com/blog/2013/05/Knuth–Morris–Pratt_algorithm.html
public class code28 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNext("ABCDABD")));
        System.out.println(strStr3("BBC ABCDAB ABCDABDABDE","ABCDABD"));

    }

    // KMP算法
    public static int strStr3(String haystack, String needle) {
        char[] t = haystack.toCharArray();
        char[] p = needle.toCharArray();
        int i = 0; // 主串的位置
        int j = 0; // 模式串的位置
        int[] next = getNext(needle);
        while (i < t.length && j < p.length) {
            if (j == -1 || t[i] == p[j]) { // 当j为-1时，要移动的是i，当然j也要归0
                i++;
                j++;
            } else {
                // i不需要回溯了
                // i = i - j + 1;
                j = next[j]; // j回到指定位置
            }
        }
        if (j == p.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    public static int[] getNext(String ps) {
        char[] p = ps.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                if (p[++j] == p[++k]) { // 当两个字符相等时要跳过
                    next[j] = next[k];
                } else {
                    next[j] = k;
                }
            } else {
                k = next[k];
            }
        }
        return next;

    }
//    private static int strStr1(String ts, String ps) {
//        char[] t = ts.toCharArray();
//        char[] p = ps.toCharArray();
//        int i = 0; // 主串的位置
//        int j = 0; // 模式串的位置
//        while (i < t.length && j < p.length) {
//            if (t[i] == p[j]) { // 当两个字符相同，就比较下一个
//                i++;
//                j++;
//            } else {
//                i = i - j + 1; // 一旦不匹配，i后退
//                j = 0; // j归0
//            }
//        }
//        if (j == p.length) {
//            return i - j;
//        } else {
//            return -1;
//        }
//    }

//    public static int strStr(String haystack, String needle) {
//        if (needle.length()>haystack.length()){
//            return -1;
//        }
//        char[] chars1 = haystack.toCharArray();
//        char[] chars2 = needle.toCharArray();
//        for (int i = 0; i < chars1.length; i++) {
//            if (chars1[i] == chars2[0]){
//                for (int j = 0; j < chars2.length; j++) {
//                    if (chars1[i+j]==chars2[j] && j == chars2.length-1){
//                        return i;
//                    }
//                }
//            }
//        }
//        return -1;
//    }
}
