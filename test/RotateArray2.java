package test;

public class RotateArray2 {


	public static void rotate(int[] nums, int k) {

	
		
		if(k > nums.length) {
			k = k%(nums.length);
		}
		
		int length = nums.length;
		int firstPart = length-k;
		int secondPart = k;
		int i = 0;
		int j = firstPart-1;
		while(i < j ) {
			int temp = nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
		
		int s=length-k;
		int t = length-1;
		while(s < t ) {
			int temp = nums[s];
			nums[s]=nums[t];
			nums[t]=temp;
			s++;
			t--;
		}
		
		int m = 0;
		int n = length-1;
		
		while(m < n ) {
			int temp = nums[m];
			nums[m]=nums[n];
			nums[n]=temp;
			m++;
			n--;
		}
		
		


	}

	public static void main(String[] args) {
		//rotate(new int[]{-1,-100,3,99},2);
		rotate(new int[] {1,2,3,4,5,6,7},3);
		//rotate(new int[] {1,2},3);


	}

}
