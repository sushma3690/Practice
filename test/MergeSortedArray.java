package test;

public class MergeSortedArray {



	public static void merge(int[] nums1, int m, int[] nums2, int n) {


		for(int j = 0;  j < nums2.length; j++) {
			int i =0;
			System.out.println(" m "+m);
			for(int p = 0; p < nums1.length; p++) {
				System.out.println(nums1[p]+" ");
			}
			if(nums2[j] >= nums1[i] ) {
				//flip till u find pos in while i++
				while (i < nums1.length && nums2[j] >= nums1[i] &&  i < m) {
					i++;
				}
				System.out.println(" final i"+i);
				for(int k = nums1.length-1; k >= i+1; k--) {
					nums1[k]=nums1[k-1];
					
				}
				
				//exchange
			}else {
				if(nums2[j]<nums1[i]) {
					for(int k = nums1.length-1; k >= i+1; k--) {
						nums1[k]=nums1[k-1];
					}
				}
				//flip and exchange
			}
		
			nums1[i]=nums2[j];
			m++;
		}
		
	for(int p = 0; p < nums1.length; p++) {
		System.out.println(nums1[p]+" ");
	}

	}

	public static void main(String[] args) {
		merge(new int[] {1,2,3,0,0,0},3,new int[] {2,5,6},3);
	}


}
