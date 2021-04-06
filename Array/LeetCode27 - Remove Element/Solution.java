package com.WPU.LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {	
	public int removeElement(int[] nums, int val) {
        int f_ = 0, s_ = 0; 
		for (int v_: nums) {
        	if (nums[f_] != val) {
        		nums[s_] = nums[f_];
        		f_ += 1;
        		s_ += 1;
        	} else {
        		f_ += 1;
        	}
        }
		return s_;
    }
}
