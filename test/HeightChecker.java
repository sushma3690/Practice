package test;

import java.util.Arrays;

public class HeightChecker {
	
	 public static int heightChecker(int[] heights) {
		 int[] newArr = new int[heights.length];
		 for(int i = 0; i < heights.length; i++) {
			 newArr[i]=heights[i];
		 }
		 Arrays.sort(heights);
		 int count=0;
		 
		 for(int i = 0; i < heights.length; i++) {
			 if(newArr[i] != heights[i]) {
				 count++;
			 }
		 }
		 
		return count;
	        
	    }
	 
	public static void main(String[] args) {
		
		System.out.println(heightChecker(new int[] {5,1,2,3,4}));
		
	}

}
