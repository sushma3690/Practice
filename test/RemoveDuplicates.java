package test;

public class RemoveDuplicates {

	public static int removeElement(int[] nums, int val) {
		int res=0;
		int i = 0; int j = nums.length-1;

		while(i < j) {
			if(nums[i] == val) {
				while(nums[j] == val && j >0 && i < j) {
					j--;
				}
					int temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
					j--;
			}
			i++;
		}

		for(int k = 0; k < nums.length; k++) {
			if(nums[k] !=val) {
				res++;
			}
		}

		return res;

	}

	public static void main(String[] args) {
		// System.out.println(removeElement(new int[] {1},1));
		// System.out.println(removeElement(new int[] {3,3},3));
		// System.out.println(removeElement(new int[] {2,2,3},2));
		System.out.println(removeElement(new int[] {2,3,3},3));


	}

}
