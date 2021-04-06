public class Solution {
	public int minSubArrayLen(int target, int[] nums) {
  	//System.out.println(Arrays.toString(nums));	        
		int sum=0;
		int min=Integer.MAX_VALUE;
	
	    for(int i=0,j=0;i<nums.length;i++ ){
	        sum=sum+nums[i];
	        
	        while(sum>=target ){
	             sum=sum-nums[j];
	             min=Math.min(i-j+1,min);
	             j++;
	         }
	    }
	    if(min==Integer.MAX_VALUE)
	        return 0;
	    
	    return min; 
	}
}
