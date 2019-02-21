package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class code54 {
    public static void main(String[] args) {
        System.out.println(FirstAppearingOnce("go"));

    }

    public static char FirstAppearingOnce(String str)
    {
        char[] chars = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        Set<Character> set1 = new LinkedHashSet<>();
        for (char aChar : chars) {
            if (!set.add(aChar)) {
                set1.add(aChar);
            }
        }
        set.removeAll(set1);
        List<Character> list = new ArrayList<>(set);
        if (!list.isEmpty()){
            return list.get(0);
        }else {
            return '#';
        }
    }

}
