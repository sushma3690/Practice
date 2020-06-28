package test;

public class SortArrayByParity2 {
	
	 public static int[] sortArrayByParity(int[] A) {
		 
		 for(int i = 0; i < A.length; i++) {
			 for(int k = 0; k < A.length; k++) {
				 System.out.print(A[k]+" ");
			 }
			 if(A[i]%2==1) {
				 int j = i+1;
				 while(j < A.length && A[j]%2!=0) {
					 j++;
				 }
				 if(j >= A.length) {
					 break;
				 }
				 int temp = A[i];
				 A[i]=A[j];
				 A[j]=temp;
				 System.out.println("J "+j);
			 }
		 }
		 
		return A;
	        
	    }
	 public static void main(String[] args) {
		 sortArrayByParity(new int[] {3,1,2,4});
	 }
	

}
