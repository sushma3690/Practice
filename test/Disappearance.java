package test;

import java.util.ArrayList;
import java.util.List;

public class Disappearance {

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++) {
			System.out.println(Math.abs(nums[i]));
			nums[Math.abs(nums[i])-1]= -Math.abs(nums[Math.abs(nums[i])-1]);
		}

		

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] >0) {
				res.add(i+1);
			}
		}

		return res;

	}

	public static void main(String[] args) {
		System.out.println(findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
	}



}
