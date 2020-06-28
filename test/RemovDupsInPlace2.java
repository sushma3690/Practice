package test;

public class RemovDupsInPlace2 {

	public static int removeDuplicates(int[] nums) {

		int i = 0; 
		int j = i+1;
		int prevVal=nums[0];
		boolean exhcangeNeeded=false;
		while(i < nums.length && j < nums.length) {
			while(j < nums.length && nums[i]<=prevVal && nums[j] <= prevVal) {
				j++;
				exhcangeNeeded=true;
			}
			if(j == nums.length) {
				break;
			}
			prevVal=nums[j];
			//System.out.println(prevVal);
			//System.out.println(exhcangeNeeded);

			if(exhcangeNeeded) {
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		
			j=i+1;
			System.out.println("here1 "+i+' '+j);


		}
		int count = 0;
		for(int m = 0; m < nums.length; m++) {
			System.out.println(nums[m]);
		}
		/*
		 * for(int m = 0; m < nums.length; m++) { count++;
		 * 
		 * if(m > 0 && nums[m]<nums[m-1]) { break; } }
		 */
		return count;

	}

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] {1,1,2}));
	}

}
