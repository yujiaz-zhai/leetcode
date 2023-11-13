package 双指针;

public class leetcode42 {
    public static int trap(int[] height) {
        int len = height.length;
        int [] left = new int[len];
        int [] right = new int[len];
        left[0] = height[0];
        right[len-1] = height[len-1];
        //当前点往左最大的高度
        for(int i=1; i<len; i++){
            left[i] = Math.max(height[i], left[i-1]);
        }
        //当前点往右最大的高度
        for(int i=len-2; i>=0; i--){
            right[i] = Math.max(height[i], right[i+1]);
        }
        int res = 0;
        //对于每个点来说，能存水的高度就是 左右最大高度 减去自身高度
        for(int i=0;i<len;i++){
            res += (Math.min(left[i], right[i]) - height[i]);
        }
        return res;
    }
    public static void main(String[] args){
        int[] height = {8,8,1,5,6,2,5,3,3,9};
        System.out.println(trap(height));
    }
}
