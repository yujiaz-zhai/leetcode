package 热题100.哈希;
import java.util.*;
public class leetcode128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Map<Integer, Integer> hashmap = new HashMap<>();
        int res = 1;
        for(int num: nums){
            if(hashmap.containsKey(num) == false) hashmap.put(num, 1);
        }
        Arrays.sort(nums);
        for(int num: nums){
            if(hashmap.containsKey(num - 1)){
                hashmap.put(num, hashmap.get(num - 1) + 1);
                if((hashmap.get(num - 1) + 1) > res) res = hashmap.get(num - 1) + 1;
            }
        }
        return res;
    }
}
