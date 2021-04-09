class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (Integer i: nums1) {set1.add(i);}
		
		int[] result = new int[set1.size()];
		int ind_ = 0;
		for (Integer i :nums2) {
			if (set1.contains(i)) {
				result[ind_++] = i;
                set1.remove(i);
			}
		}
		
		return Arrays.copyOf(result, ind_);
    }
}
