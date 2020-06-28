package test;

public class RemovDupsInPlace {

	public static int removeDuplicates(int[] nums) {
		
		int currentIndex=1;
		for(int i=1; i < nums.length; i++) {
			if(nums[i] != nums[i-1]) {
				nums[currentIndex]=nums[i];
				currentIndex++;
			}
		}
		for(int m = 0; m < nums.length; m++) {
			System.out.println(nums[m]);
		}
		return currentIndex;

	
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] {1,1,2}));
	}

}
