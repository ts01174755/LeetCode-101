class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) continue;
			if(i >0 && nums[i] == nums[i-1]) continue;
			
            Set<Integer> set = new HashSet<>();
			for (int j = i+1; j < nums.length; j++) {
                if (j > i + 2 && nums[j] == nums[j-1] && nums[j-1] == nums[j-2]) continue;

                int c = -(nums[i] + nums[j]);
				if(set.contains(c)) {
					Integer[] ans_ = {nums[i], nums[j], c};
					ans.add(Arrays.asList(ans_));
					set.remove(c);
				} else {
					set.add(nums[j]);
				}
			}
		}
		return ans;
        
    }
}
