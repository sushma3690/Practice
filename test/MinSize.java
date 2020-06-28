package test;

public class MinSize {
	
	  public static int minSubArrayLen(int s, int[] nums) {
		  
		  if(nums == null || nums.length==0) {
			  return 0;
		  }
		  if(nums.length == 1) {
			  if(nums[0] > s) {
				  return 1;
			  }else {
				  return 0;
			  }
		  }
		  
		  int sum = 0;
		  int count = Integer.MAX_VALUE;
		  int tempCount=0;
		  int previ = 0;
		  for(int i = 0; i< nums.length; i++) {
			  sum = sum+nums[i];
			  if(sum >= s) {
				  //tempCount = i+1;
				  int endi = i;
				  tempCount= endi-previ+1;
				  if(tempCount < count) {
					  count =  tempCount;
				  }
				  sum=0;
				  tempCount=0;
				  previ=i+1;
			  }
		  }
		  
		return count;
	        
	    }
	  
	  public static void main(String[] args) {
		  System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
	  }

}
