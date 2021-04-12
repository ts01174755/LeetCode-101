class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
        	if (i > 0 && nums[i-1] == nums[i]) continue;
        	
        	for (int j = i+1; j < nums.length; j++) {
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
