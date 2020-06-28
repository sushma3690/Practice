package test;

public class SUM11 {

	public static int[] twoSum(int[] numbers, int target) {
		int[] res=new int[2];

		int i = 0;
		int j = numbers.length-1;
		boolean found = false;
		while(i < j) {
			if(numbers[i]+numbers[j] == target) {
				found=true;
				break;
			}else if(numbers[i]+numbers[j] > target) {
				j--;
			}else if(numbers[i]+numbers[j] < target) {
				i++;
			}
		}
		if(found) {
			res[0]=i+1;
			res[1]=j+1;
		}

		return res;

	}

	public static void main(String[] args) {
		int[] res = twoSum(new int[]{2,7,11,15},9);
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
	}

}
