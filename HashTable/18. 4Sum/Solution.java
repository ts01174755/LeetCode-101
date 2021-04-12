class Solution {
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        if(nums.length < 4) 
        	return ans;
        Arrays.sort(nums);
        
        if ( nums[0]+nums[1]+nums[2]+nums[3] > target 
        		||  nums[n-1]+nums[n-2]+nums[n-3]+nums[n-4] < target)
			return ans;
       
        for (int i = 0; i < nums.length-3; i++) {
        	if (i > 0 && nums[i-1] == nums[i]) continue;
        	
        	for (int j = i+1; j < nums.length-2; j++) {
        		if (j > i + 1 && nums[j] == nums[j-1]) continue;
        		
        		int l_ = j+1, r_ = nums.length-1;
        		while(l_ < r_) {
        			int cnt = nums[i] + nums[l_] + nums[r_] + nums[j];
        			if(cnt > target) r_--;
        			else if(cnt < target) l_++;
        			else {
            			while(l_ < r_ && nums[r_] == nums[r_-1]) r_--;
            			while(l_ < r_ && nums[l_] == nums[l_+1]) l_++;
        				Integer[] ans_ = {nums[i], nums[l_], nums[r_], nums[j]};
        				ans.add(Arrays.asList(ans_));
                        r_--;
                        l_++;
        			}
        		}
        	}
        }
        return ans;
    }
}
