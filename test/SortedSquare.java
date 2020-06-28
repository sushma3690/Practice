package test;

public class SortedSquare {
	
	 public static int[] sortedSquares(int[] A) {
		 if(A == null || A.length == 0) {
			 return new int[] {};
		 }
		 int  i = 0;
		 int j = A.length-1;
		 int k = A.length-1;
		 int[] result = new int[A.length];
		 while(k >= 0) {
			 int iSquare = A[i]*A[i];
			 int jSquare = A[j]*A[j];
			 if(iSquare <= jSquare) {
				 result[k]=jSquare;
				 j--;
			 }else {
				 result[k]=iSquare;
				 i++;
			 }
			 k--;
		 }
		 
		 for(int l =0; l < result.length;l++) {
			 System.out.println(result[l]);
		 }
		 
		return result;
	        
	    }
	 
	 public static void main(String[] args) {
		 sortedSquares(new int[]{-4,-1,0,3,10});
		}

}
