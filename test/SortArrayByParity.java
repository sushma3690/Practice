package test;

public class SortArrayByParity {
	
	 public static int[] sortArrayByParity(int[] A) {
		    int i = 0;
		    int j = 0;
		    int temp;
		    
		    for(i=0;i<A.length;i++){
		        if((A[i] %2) == 0 ){
		            temp = A[i];
		            A[i] = A[j];
		            A[j] = temp;
		            j++;
		        }
		    }
		    
		    for(int k = 0;k < A.length; k++) {
		    	System.out.print(A[k]+" ");
		    }
		    System.out.println();
		    return A;
	 }
	 public static void main(String[] args) {
		 sortArrayByParity(new int[] {3,1,2,4});
		 sortArrayByParity(new int[] {2,2,2,2,3,3});

	 }
	

}
