/*
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> res;
        set<vector<int>> hash;
        int len = nums.size();
        if(nums[0] > 0 || nums[len-1] < 0) return res;
        for(int i=0; i<len; i++){
            if(nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1] ) continue;
            int l=i+1, r=len-1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    vector<int> list = {nums[i], nums[l], nums[r]};
                    hash.insert(list);
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
        for(auto& list: hash){
            res.push_back(list);
        }
        return res;
    }
};
*/