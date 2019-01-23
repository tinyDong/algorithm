package leetCode.code250;

//示例 1:
//输入: "aacecaaa"
//输出: "aaacecaaa"
//
//示例 2:
//输入: "abcd"
//输出: "dcbabcd"

//abbabaab
//baababbabaab

//1 求最长回文字符串 剩余部分补齐
//2 字符串倒序  求2个字符串KMP匹配部分
public class code214 {
    public static void main(String[] args) {
        String str = "abaab";
        String result = shortestPalindrome(str);
        System.out.println(result);
    }
//"baaabbabaab"
//"baababbabaab"
    public static String shortestPalindrome(String s) {

//        String r = new StringBuilder(s).reverse().toString();
//        String t = s + "#" + r;
//        System.out.println(t);
//        int[] next = new int[t.length()];
//
//        for (int i = 1; i < t.length(); ++i) {
//            int j = next[i - 1];
//            while (j > 0 && t.charAt(i) != t.charAt(j))
//            {
//                j = next[j - 1];
//            }
//
//            j =j + ((t.charAt(i) == t.charAt(j)) ? 1 : 0);
//            next[i] = j;
//        }
//        return r.substring(0, s.length() - next[t.length() - 1]) + s;

        String r = new StringBuilder(s).reverse().toString();
        String t = s + "#" + r;
        System.out.println(t);
        int[] next = new int[t.length()];
        for (int i = 1; i < t.length(); i++) {
            int j = next[i-1];
            while (j>0 && t.charAt(i) != t.charAt(j)){
                j = next[j - 1];
            }
            j = j + (t.charAt(i)==t.charAt(j) ? 1:0);
            next[i] = j;
        }
        return r.substring(0,r.length() - next[t.length()-1])+s;
    }

}
