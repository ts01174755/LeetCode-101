package com.WPU.LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		
		int st = 0, ed = nums.length - 1;
				
		while (st <= ed) {
			int mid_ind = (st + ed)/2;
			
			if (nums[mid_ind] == target) {
				break;
			} else if (nums[mid_ind] <= target){
				st = mid_ind + 1;
			} else {
				ed = mid_ind -1;
			}
			
		}
		return st;
    }
	
}
