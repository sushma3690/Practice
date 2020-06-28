package test;

public class SortedSum {

	public static void main(String[] args) {

		int a[] = {100,102,104,200};
		int b[] = {2,4,6,8};
		int[] sumArr = new int[5];
		boolean first = false;
		if(a[0] > b[0]) {
			first=true;
		}
		int k =0;
		if(first) { //make it configurable to pass right array
			for(int i = 0 ; i < a.length; i++) {
				//System.out.println(a[i]+"  "+b[i]);


				int sum =0;
				for(int j = 0; j < b.length; j++) {
					sum = a[i]+b[j];
					if(k == 5) {
						break;
					}
					sumArr[k]=sum;
					k++;
					if(i+1 < a.length && sum > a[i+1]  ) {
						i = i +1;
						break;

					}
					
				}
				
			}
		}

		for(int i = 0; i < sumArr.length; i++) {
			System.out.print(" "+sumArr[i]);
		}

	}

}
