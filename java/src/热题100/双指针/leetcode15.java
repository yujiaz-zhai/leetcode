package 热题100.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class leetcode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> hash = new HashSet<>();
        int len = nums.length;
        if(nums[0] > 0 || nums[len-1] < 0) return res;
        for(int i=0; i<len; i++){
            if(nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1] ) continue;
            int l=i+1, r=len-1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0 && nums[l] != nums[r]){
                    hash.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                }else if(sum > 0){
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    l++;
                    r--;
                }
            }
        }
        for(List<Integer> list : hash){
            res.add(list);
        }
        return res;
    }
    public static void main(String[] args){
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
