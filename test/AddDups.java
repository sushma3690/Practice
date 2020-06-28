package test;

public class AddDups {
	
	 public static void duplicateZeros(int[] arr) {
		 
		 int i = 0 ;
		while(i < arr.length) {
			//System.out.println("here");
			//System.out.println(i+" and "+arr.length);
			 if(arr[i] == 0) {
				 System.out.println("here "+i);

				 for(int j = arr.length-1; j >= i+2; j--) {
					 arr[j]=arr[j-1];
				 }
				 for(int k = 0; k < arr.length; k++) {
					 System.out.print(arr[k]+ " ");
				 }
				 if(i+1< arr.length) {
				 arr[i+1]=arr[i];
				 }
				
				 System.out.println();
				 i=i+2;
				 
			 }else {
				 i++;
			 }
			 
			 //i=i+2;
		 }
		 
		 for(int k = 0; k < arr.length; k++) {
			 System.out.print(arr[k]+ " ");
		 }
	        
	    }
	 public static void main(String[] args) {
		// duplicateZeros(new int[] {1,0,2,3,0,4,5,0}); //1,0,0,2,3,0,0,4
		// duplicateZeros(new int[] {0, 0, 0, 0, 0, 0, 0 });
		// duplicateZeros(new int[] {0,4,1,0,0,8,0,0,3});//[0,0,4,1,0,0,0,0,8]
		 //[1,0,2,3,0,4,5,0]
		 duplicateZeros(new int[] {1,0,2,3,0,4,5,0});//[1,0,0,2,3,0,0,4]
	 }

}
