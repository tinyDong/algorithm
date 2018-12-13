package leetCode;

//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
//
//示例:
//
//输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
//输出:
//[
//["ate","eat","tea"],
//["nat","tan"],
//["bat"]
//]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class code49 {

    public static void main(String[] args) {
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strings));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String >> map = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] temp= str.toCharArray();
            Arrays.sort(temp);
            String tempStr= Arrays.toString(temp);

            if (!map.containsKey(tempStr)){
                ArrayList<String> subList = new ArrayList<>();
                subList.add(str);
                map.put(tempStr,subList);
            }else {
                map.get(tempStr).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }

}
