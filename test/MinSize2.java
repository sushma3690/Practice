package test;

public class MinSize2 {

	public static int minSubArrayLen(int s, int[] nums) {

		if(nums == null || nums.length==0) {
			return 0;
		}
		if(nums.length == 1) {
			if(nums[0] >= s) {
				return 1;
			}else {
				return 0;
			}
		}

		int lo=0;
		int hi=0;
		int sum=0;
		int count= nums.length+1;

		while(hi < nums.length) {
			sum = sum + nums[hi];
			while(sum >= s) {
				count = Math.min(count, hi - lo + 1);
				sum = sum-nums[lo];
				lo++;
			}
			hi++;
		}
		return count==nums.length+1?0:count;

	}

	public static void main(String[] args) {
		System.out.println(minSubArrayLen(3,new int[]{1,1}));
	}

}
