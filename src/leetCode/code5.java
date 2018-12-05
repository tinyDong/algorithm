package leetCode;
//5. 最长回文子串
//示例 1：
//输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
//示例 2：
//
//输入: "cbbd"
//输出: "bb"
public class code5 {

    public static void main(String[] args) {
        String str = "xabcbax";

        String result = getLongestStr(str);
        System.out.println(result);
    }

    private static String getLongestStr(String str) {

        char[] chars = str.toCharArray();

        String max ="";
        String result;
        for (int i = 0; i < chars.length; i++) {
            result = getMaxStr(str,i,i);
            System.out.println("i=="+i+"    result1===="+result);
            if (max.length()>result.length()){
                max = result;
            }

            result = getMaxStr(str,i,i+1);
            System.out.println("i=="+i+"    result2===="+result);
            if (max.length()>result.length()){
                max = result;
            }
        }
        return max;
    }

    private static String getMaxStr(String str, int start, int end) {
        Integer length = str.length()-1;
        String result = "";
        while (start>=0&&end<=length&&str.charAt(start)==str.charAt(end)){
            result = result.length()> str.substring(start,end+1).length()?result:str.substring(start,end+1);
            start--;
            end++;
        }
        if (end-start<1){
            return "";
        }
        return result;
    }
}
