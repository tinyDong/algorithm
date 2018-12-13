package leetCode.code50;

import java.util.HashMap;
//罗马字符串转数字
public class code13 {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        int resylt = romanToInt(str);
        System.out.println(resylt);
    }

    public static int romanToInt(String str) {
        if (str == null || str.length() == 0)    return -1;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(str.charAt(str.length()-1));
        for (int i = str.length()-2; i >=0 ; i--) {

            if (map.get(str.charAt(i))>=map.get(str.charAt(i+1))){
                result = result + map.get(str.charAt(i));
            }else {
                result = result - map.get(str.charAt(i));
            }
        }
        return result;
    }
}



















//    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        map.put('I', 1);
//                map.put('V', 5);
//                map.put('X', 10);
//                map.put('L', 50);
//                map.put('C', 100);
//                map.put('D', 500);
//                map.put('M', 1000);
//                int len = str.length();
//                int result = map.get(str.charAt(len - 1));
//
//                for (int i = len - 2; i >= 0; i--) {
//                if (map.get(str.charAt(i)) >= map.get(str.charAt(i + 1)))
//                result =result + map.get(str.charAt(i));
//                else
//                result =result- map.get(str.charAt(i));
//                }
//                return result;