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
//http://www.ruanyifeng.com/blog/2013/05/Knuth–Morris–Pratt_algorithm.html
//https://www.zhihu.com/search?type=content&q=kmp
public class code28 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getNext("abab")));
        System.out.println(strStr3("BBC ABCDAB ABCDABDABDE","ABCDABD"));

    }

    private static int strStr3(String haystack, String needle) {

        char[] char1 = haystack.toCharArray();
        char[] char2 = needle.toCharArray();

        int[] next = getNext(needle);
        int i = 0;
        int j = 0;

        while (i<char1.length&& j < char2.length){
            if (j==-1||char1[i]==char2[j]){
                i++;
                j++;
            }else {
                j = next[j];
            }
        }

        return j ==char2.length?i-j:-1;
    }

    private static int[] getNext(String needle) {

        char[] chars = needle.toCharArray();
        int[] next = new int[needle.length()];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j<needle.length()-1){
            if (k==-1||chars[j]==chars[k]){
                j++;
                k++;
                next[j]=k;
            }else {
                k = next[k];
            }
        }
        return next;
    }


    // KMP算法
//    public static int strStr3(String haystack, String needle) {
//        char[] t = haystack.toCharArray();
//        char[] p = needle.toCharArray();
//        int i = 0; // 主串的位置
//        int j = 0; // 模式串的位置
//        int[] next = getNext(needle);
//        while (i < t.length && j < p.length) {
//            if (j == -1 || t[i] == p[j]) { // 当j为-1时，要移动的是i，当然j也要归0
//                i++;
//                j++;
//            } else {
//                j = next[j]; // j回到指定位置
//            }
//        }
//        return j == p.length? i-j:-1;
//    }
//
//    private static int[] getNext(String needle) {
//        char[] chars =needle.toCharArray();
//        int[] next = new int[chars.length];
//        next[0] = -1;
//        int j =  0;
//        int k = -1;
//        while (j<chars.length-1){
//            if (k==-1 || chars[j]==chars[k]){
//                j++;
//                k++;
//                next[j] = k;
//            }else {
//                k =next[k];
//            }
//        }
//        return next;
//    }


//    abababca
//     abababca
//    private static int[] getNext(String ps) {
//        char[] p = ps.toCharArray();
//        int[] next = new int[p.length];
//        next[0] = -1;
//        int j = 0;
//        int k = -1;
//        while (j < p.length - 1) {
//            if (k == -1 || p[j] == p[k]) {
//                k++;
//                j++;
//                next[j] = k;
//            } else {
//                k = next[k];
//            }
//        }
//        return next;
//    }


}
