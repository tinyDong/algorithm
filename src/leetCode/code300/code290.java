package leetCode.code300;

import java.util.HashMap;
import java.util.Map;

//这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
//
//示例1:
//
//输入: pattern = "abba", str = "dog cat cat dog"
//输出: true
//示例 2:
//
//输入:pattern = "abba", str = "dog cat cat fish"
//输出: false
public class code290 {

    public static void main(String[] args) {

        String pattern = "jquery", str = "jquery";
        System.out.println(wordPattern(pattern,str));
    }

    public static boolean wordPattern(String pattern, String str) {
        char[] char1 = pattern.toCharArray();
        String[] strings = str.split(" ");
        if (char1.length!=strings.length){
            return false;
        }
        Map<Character,String> map =new HashMap<>();
        for (int i = 0; i < char1.length; i++) {
            if (map.containsKey(char1[i])){
                if (!map.get(char1[i]).equals(strings[i])){
                    return false;
                }
            }else {
                if (map.containsValue(strings[i])&&!map.containsKey(char1[i])){
                    return false;
                }else {
                    map.put(char1[i],strings[i]);
                }

            }
        }
        return true;
    }

}
