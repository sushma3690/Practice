package test;

public class MountainArray {

	public static boolean validMountainArray(int[] A) {

		boolean posiitve=false;
		boolean negative = false;
		boolean res = false;
		for(int i = 0; i < A.length; i++) {
			if(i+1 < A.length && A[i] < A[i+1]) {
				if(!negative) {
					posiitve = true;
				}
				if(posiitve) {
					
				}
				System.out.println(i+" positve "+posiitve);
			}else if(i+1 < A.length && A[i] > A[i+1]){
				if(i != 0) {
					negative=true;
				}else {
					negative=false;
				}
				System.out.println(i+" negative "+negative);

			}
			/* if(i+1 < A.length && negative && A[i] >= A[i+1]) {
				 System.out.println("here");
				 negative = false;
			 }*/
		}
		return posiitve&&negative;

	}
	public static void main(String[] args) {
		System.out.println(validMountainArray(new int[] {3,5,5}));
		System.out.println(validMountainArray(new int[] {0,3,4,2,1}));

	}

}
