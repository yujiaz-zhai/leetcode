package 热题100.滑动窗口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode438 {

    //暴力方法
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        char[] charp = p.toCharArray();
        Arrays.sort(charp);
        String sp = new String(charp);
        for(int i=0; i<s.length()-p.length()+1; i++){
            String sub = s.substring(i, i+p.length());
            char[] chars = sub.toCharArray();
            Arrays.sort(chars);
            String ss = new String(chars);
            if(ss.equals(sp)){
                res.add(i);
            }
        }
        return res;
    }
    //官方题解：
    /*
    根据题目要求，我们需要在字符串 sss 寻找字符串 ppp 的异位词。因为字符串 ppp 的异位词的长度一定与字符串 ppp 的长度相同，
    所以我们可以在字符串 sss 中构造一个长度为与字符串 ppp 的长度相同的滑动窗口，并在滑动中维护窗口中每种字母的数量；当窗口中
    每种字母的数量与字符串 ppp 中每种字母的数量相同时，则说明当前窗口为字符串 ppp 的异位词。
    */
    public List<Integer> Solution_findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; ++i) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }

        for (int i = 0; i < sLen - pLen; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pLen) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
    public static void main(String[] args){
        String s = new String("abab");
        String p = new String("ab");
        System.out.println(findAnagrams(s, p));
    }
}
