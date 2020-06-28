package test;

public class RotateArray {


	public static void rotate(int[] nums, int k) {

		int[] temp = new int[k];
		int count=0;
		int j = 0;
		
		if(k > nums.length) {
			k = k%(nums.length);
		}
		
		while(count < k) {
			temp[count] = nums[nums.length-k+j];
			count++;
			j++;
		}
		for(int f =0; f < temp.length;f++) {
			System.out.println(temp[f]+" temp");
		}


		for(int l = nums.length-k-1;l>=0; l--) {
			nums[l+k]=nums[l];
		}


		for(int l = 0; l < k; l++) { nums[l] = temp[l]; }
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		


	}

	public static void main(String[] args) {
		//rotate(new int[]{-1,-100,3,99},2);
		//rotate(new int[] {1,2,3,4,5,6,7},3);
		rotate(new int[] {1,2},3);


	}

}
