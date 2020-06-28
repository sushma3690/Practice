package test;

public class MaxContinuous1 {

	public static int findMaxConsecutiveOnes(int[] nums) {
		
		int res=0;
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				count++;
			}else {
				if(res < count) {
					res = count;
				}
			count=0;
			}
		}
		if(res < count) {
			res = count;
		}
		
		return res;

	}
	
	public static void main(String[] args) {
		
		System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
	}


}
