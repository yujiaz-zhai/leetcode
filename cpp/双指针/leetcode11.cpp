/*
class Solution {
public:
    int maxArea(vector<int>& height) {
        int len = height.size();
        int lasti = -1;
        int maxx = -1;
        for(int i=0; i<len; i++){
            if(height[i] <= lasti) continue;
            lasti = height[i];
            for(int j=i+1; j<len; j++){
                if(min(height[i], height[j]) * (j-i) > maxx){
                    maxx = min(height[i], height[j]) * (j-i);
                }
            }
        }
        return maxx;
    }
};
 */