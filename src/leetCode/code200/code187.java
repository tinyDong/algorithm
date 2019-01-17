package leetCode.code200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class code187 {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAA";
        List<String> strings =findRepeatedDnaSequences(s);
        System.out.println(strings);
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        if (s==null || s.length()==0){
            return list;
        }
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (int i = 0; i < s.length()-9; i++) {
            String temp = s.substring(i,i+10);
            if (!set1.add(temp)){
                set2.add(temp);
            }
        }
        list.addAll(set2);
        return list;
    }
}
