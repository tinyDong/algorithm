package leetCode.code250;

import java.util.HashMap;
import java.util.Map;

//示例 1:
//输入: s = "egg", t = "add"
//输出: true
//示例 2:
//
//输入: s = "foo", t = "bar"
//输出: false
//示例 3:
//
//输入: s = "paper", t = "title"
//输出: true
public class code205 {

    public static void main(String[] args) {
        String s1  ="foo" ,  s2 ="bar";
        System.out.println(isIsomorphic(s1,s2));
    }

    public static boolean isIsomorphic(String s, String t) {
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        for (int i = 0; i < char1.length; i++) {
            if (map.containsKey(char1[i])){
                if (map.get(char1[i])!=char2[i]){
                  return false;
                }
            }else {
                if (map.containsValue(char2[i])&&!map.containsKey(char1[i])){
                    return false;
                }else {
                    map.put(char1[i],char2[i]);
                }
            }
        }
        return true;
    }
}
