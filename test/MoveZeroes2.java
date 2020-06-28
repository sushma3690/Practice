package test;

public class MoveZeroes2 {

	public static void moveZeroes(int[] nums) {
		
		int i = 0;
		int j = 0;
		while(j < nums.length) {
			if(nums[j] != 0) {
				nums[i]=nums[j];
				i++;
			}
			j++;
		}
		
		while(i < nums.length) {
			nums[i]=0;
			i++;
		}
		
}

	public static void main(String[] args) {
		moveZeroes(new int[]{4,2,4,0,0,3,0,5,1,0});
	}

}
