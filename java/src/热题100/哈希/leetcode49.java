package 热题100.哈希;
import java.util.*;
public class leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> hashmap = new HashMap<>();
        for(String str: strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String nstr = new String(ch);
            List<String> list = hashmap.getOrDefault(nstr, new ArrayList<>());
            list.add(str);
            hashmap.put(nstr, list);
        }
        return new ArrayList<List<String>> (hashmap.values());
    }
}
