package test;

import java.util.HashSet;

public class CheckDoubleOrHald {
	
	 public static boolean checkIfExist(int[] arr) {
		 int zeroC=0;
		 boolean returnVal = false;
		 HashSet<Integer> st = new HashSet<Integer>();
		 for(int i = 0; i < arr.length; i++) {
			 int num = arr[i];
			boolean b= st.add(num);
			if(!b && num == 0) {
				zeroC++;
			}
		 }
        	 for(int i = 0; i < arr.length; i++) {
			 int num = arr[i];
			 int dble = num*2;
			 
			 if(num == 0 && zeroC == 0) {
				 continue;
			 }
			
			 if(st.contains(dble)) {
			

				 return true;
			 }
			
		 }
		return false;
	 }
	 public static void main(String[] args) {
		 //System.out.println(checkIfExist(new int[] {10,2,5,3}));
		// System.out.println(checkIfExist(new int[] {7,1,14,11}));
		 //System.out.println(checkIfExist(new int[] {-2,0,10,-19,4,6,-8}));
		 System.out.println(checkIfExist(new int[] {-20,8,-6,-14,0,-19,14,4}));

	 }

}
