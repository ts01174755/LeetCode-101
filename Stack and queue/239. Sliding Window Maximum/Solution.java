class Solution {
  // 雙向佇列解法
    private class MyMonotoneQueue{
		Deque<Integer> deque = new LinkedList<>();

		public void pop(int val) {
			if (!deque.isEmpty() && val == deque.peekFirst()) deque.pollFirst();
		}
		public void push(int val) {
			while (!deque.isEmpty() && deque.peekLast() < val) deque.pollLast();
			deque.offerLast(val);
		}
		public int first() {
			int ans = deque.peekFirst(); 
			return ans;
		}
	}
	public int[] maxSlidingWindow(int[] nums, int k) {
		MyMonotoneQueue monoqueue = new MyMonotoneQueue();
		int[] max = new int[nums.length - k + 1];
		max[0] = nums[0];
		
		for (int i = 0; i < k; i++) {
			if (nums[i] > max[0]) max[0] = nums[i];
			monoqueue.push(nums[i]);
		}
		for (int i = k; i< nums.length; i++) {
			monoqueue.pop(nums[i-k]);
			monoqueue.push(nums[i]);
			max[i-k + 1] = monoqueue.first();
        }
        return max;
    }
	
}
