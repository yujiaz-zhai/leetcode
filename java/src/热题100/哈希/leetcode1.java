package 热题100.哈希;

import java.util.HashMap;
import java.util.Map;

public class leetcode1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hashmap.containsKey(target - nums[i])){
                return new int[]{hashmap.get(target - nums[i]), i};
            }else{
                hashmap.put(nums[i], i);
            }
        }
        return new int[0];
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
