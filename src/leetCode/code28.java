package leetCode;
//示例 1:
//
//输入: haystack = "hello", needle = "ll"
//输出: 2
//示例 2:
//
//输入: haystack = "aaaaa", needle = "bba"
//输出: -1


//https://www.cnblogs.com/yjiyjige/p/3263858.html
//https://www.cnblogs.com/leavescy/archive/2016/09/19/5884306.html
public class code28 {
    public static void main(String[] args) {
        System.out.println(strStr3("hello","ll"));
    }

    // KMP算法
    public static int strStr3(String haystack, String needle) {

        char[] char1 = haystack.toCharArray();
        char[] char2 = needle.toCharArray();

        int i =0;
        int j = 0;

        while (i<char1.length&&j<char2.length){
            if (char1[i]==char2[j]){
                i++;
                j++;
            }else {
                i = i-j + 1;
                j=0;
            }
        }
        return j==char2.length ? i-j:-1;
    }

    public static int[] getNext(String ps) {
        char[] p = ps.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                next[j] =k;
                j++;
                k++;
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
