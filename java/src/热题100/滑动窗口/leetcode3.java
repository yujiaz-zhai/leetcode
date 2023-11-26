package 热题100.滑动窗口;

import java.util.HashMap;
import java.util.Map;

public class leetcode3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
    public static void main(String[] args){
        String s = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
