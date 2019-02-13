package jianzhioffer;

import java.util.ArrayList;

public class code27 {

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> res = Permutation(str);
        System.out.println(res);
    }

    public static ArrayList<String> Permutation(String str) {

        ArrayList<String> res = new ArrayList<>();
        boolean[] visted = new boolean[3];
        char[] chars = str.toCharArray();
        helper(res,visted,new ArrayList<>(),chars,0);
        return res;
    }

    private static void helper(ArrayList<String> res, boolean[] visted, ArrayList<Character> subList, char[] chars, int index) {
        if (subList.size() == chars.length){
            StringBuilder sb = new StringBuilder();
            for (Character c : subList){
                sb.append(c);
            }
            res.add(sb.toString());
            return;
        }

        for (int i = 0; i <chars.length ; i++) {
            if(visted[i]){
                continue;
            }else {
                visted[i] = true;
            }
            subList.add(chars[i]);
            helper(res,visted,subList,chars,i+1);
            subList.remove(subList.size()-1);
            visted[i] = false;
        }

    }
}
