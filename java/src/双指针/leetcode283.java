package 双指针;

public class leetcode283 {
    static int[] nums = {0,1,0,3,12};
    static int flag = 0;
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        for(int i=0, j=0; i<len; i++){
            if(flag == 1) break;
            if(nums[i] != 0){
                continue;
            }else{
                j = i + 1;
                while(j < len){
                    if(nums[j] == 0) j++;
                    else{
                        if(j==len-1) flag = 1;
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        moveZeroes(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
