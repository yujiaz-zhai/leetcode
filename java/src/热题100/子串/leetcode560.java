package 热题100.子串;

public class leetcode560 {
    public static int subarraySum(int[] nums, int k) {
        int[] presum = new int[nums.length];
        int res = 0;
        presum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            presum[i] = presum[i-1] + nums[i];
        }
        if(presum[0] == k) res++;
        for(int i=0;i<nums.length;i++){
            if(presum[i] == k) res++;
            for(int j=i+1;j<nums.length;j++){
                if(presum[j] - presum[i] == k) res++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {1, 1, 1};
        System.out.println(subarraySum(nums, 2));
    }
}
