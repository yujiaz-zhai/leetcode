package 双指针;

public class leetcode11 {
    public static int maxArea(int[] height) {
        int len = height.length;
        int lasti = -1;
        int maxx = -1;
        for(int i=0; i<len; i++){
            if(height[i] <= lasti) continue; // 如果当前高度小于上一次的高度，就不需要计算了
            lasti = height[i];
            for(int j=i+1; j<len; j++){
                if(Math.min(height[i], height[j]) * (j-i) > maxx){
                    maxx = Math.min(height[i], height[j]) * (j-i);
                }
            }
        }
        return maxx;
    }
    public static void main(String[] args){
        int height[] = {1,3,2,5,25,24,5};
        System.out.println(maxArea(height));
    }
}
