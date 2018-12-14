package leetCode.code100;

//给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
//
//如果不存在最后一个单词，请返回 0 。
//
//说明：一个单词是指由字母组成，但不包含任何空格的字符串。
//
//示例:
//
//输入: "Hello World"
//输出: 5
public class code58 {

    public static void main(String[] args) {
        String str = "Hello World asd";

        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s) {
        if (s==null || s.length()==0){
            return 0;
        }
        char[] chars = s.toCharArray();
        int lenght=0;
        for (char c : chars){
            if (c == ' '){
                lenght=0;
                continue;
            }
            lenght++;
        }
        return lenght == s.length()?0:lenght;
    }

}
