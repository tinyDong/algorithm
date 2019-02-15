package jianzhioffer;

import java.util.HashSet;
import java.util.Set;

public class code34 {
    public static void main(String[] args) {

        String str = "aabc";
        System.out.println(FirstNotRepeatingChar(str));
    }


    public static int FirstNotRepeatingChar(String str) {
        char[] chars = str.toCharArray();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {

            if (!set1.add(chars[i])){
                set2.add(chars[i]);
            }
        }
        set1.removeAll(set2);
        Object[] characters =set1.toArray();
        return set1.isEmpty()?-1 : str.indexOf (characters[0].toString());
    }
}
