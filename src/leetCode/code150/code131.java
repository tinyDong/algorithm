package leetCode.code150;

import java.util.ArrayList;
import java.util.List;

public class code131 {

    public static void main(String[] args) {
        String str = "aabb";
        List<List<String>> res = partition(str);

        for (List<String> list : res){
            System.out.println(list);
        }
    }

    public static List<List<String>> partition(String str) {
        List<List<String>> res = new ArrayList<>();
        helper(str,0,new ArrayList<>(),res);
        return res;
    }

    private static void helper(String str,int index,List<String> subList,List<List<String>> res){
        if (index == str.length()){
            res.add(new ArrayList<>(subList));
            return;
        }

        for (int i = 1; i <= str.length()-index; i++) {
            String subStr = str.substring(index,index+i);
            if (code125.isPalindrome(subStr)){
                subList.add(subStr);
                helper(str,index+i,subList,res);
            }
            if (!subList.isEmpty()){
                subList.remove(subList.size()-1);
            }
        }
    }
}
