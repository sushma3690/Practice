package test;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {

		int i = 0;
		int j = 1;
		while(i < nums.length ) {
			if(nums[i]==0) {
				j=i+1;
				while(j < nums.length && nums[j] == 0) {
					j++;
				}
				if(j < nums.length) {
					nums[i]= nums[j];
					nums[j]=0;
				}
			}
			i++;
		}

		for(int k =0; k < nums.length; k++) {
			System.out.println(nums[k]);
		}

	}

	public static void main(String[] args) {
		moveZeroes(new int[]{4,2,4,0,0,3,0,5,1,0});
	}

}
