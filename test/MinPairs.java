package test;

import java.util.Arrays;

public class MinPairs {

	
	    public static int arrayPairSum(int[] nums) {
	    	int res=0;
	    	
	    	Arrays.sort(nums);
	    	
	    	for(int i = 0; i < nums.length; i=i+2) {
	    		res = res+nums[i];
	    	}
	    	
			return res;
	        
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(arrayPairSum(new int[]{1,4,3,2}));
	    }
	    
	    
	
}
