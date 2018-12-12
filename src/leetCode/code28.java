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

        String haystack = "aaaaa", needle = "bba";
//        String haystack = "BBC ABCDAB ABCDABDABDE", needle = "ABCDABD";
        System.out.println(strStr3(haystack,needle));

    }

    private static int strStr3(String haystack, String needle) {
        char[] char1 = haystack.toCharArray();
        char[] char2 = needle.toCharArray();

        int[] next = getNext(needle);
        int i = 0,j=0;

        while (i<char1.length&&j<char2.length){
            if (j==-1||char1[i]==char2[j]){
                i++;
                j++;
            }else {
                j = next[j];
            }
        }

        return j==char2.length?i-j:-1;
    }

    private static int[] getNext(String needle) {
        int i =0;
        int j = -1;
        int[] next = new int[needle.length()];
        next[0] = -1;
        while (i<needle.length()-1){
            if (j==-1 ||needle.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                next[i] = j;
            }else {
                j = next[j];
            }
        }
        return next;
    }


}
