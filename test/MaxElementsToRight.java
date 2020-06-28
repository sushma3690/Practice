package test;

public class MaxElementsToRight {
	
	 public static int[] replaceElements(int[] arr) {
		 int max_so_far=Integer.MIN_VALUE;
		 for(int i = arr.length-1; i >= 0; i--) {
			 if(i == arr.length-1) {
				 
				 max_so_far = arr[i];
				 arr[i]=-1;
			 }else {
			 if(max_so_far < arr[i]) {
				 int temp= max_so_far;
				 max_so_far=arr[i];
				 arr[i]=temp;
			 }else {
				 arr[i]=max_so_far;
			 }
			 
		 }
		 
		 
		 }
		 for(int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]+" ");
		 }
		return arr;
		 }
	        
	    
	 public static void main(String[] args) {
		 replaceElements(new int[] {17,18,5,4,6,1});
	 }

}
