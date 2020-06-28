package test;

public class ContinuouaSum {


	public static void main(String[] args) {
		//int[] a = {-1,1,-3,4,-1,2,1,-3,2};
		int[] a = {-1,1,-3,8,-1,-1,-1,-3,-1};
		int max = Integer.MIN_VALUE;
		int sum= 0;
		int start = 0,end=0;

		int i =0;
		while(true) {
			if(i >= a.length) {
				break;
			}
			System.out.println("i is "+i);
			System.out.println(" Sum is "+sum);
			System.out.println("sum+a[i] is "+(sum+a[i]));
			start=i;
			if(sum+a[i] >= max) {


				end = i;
				sum = sum+a[i];
				max = sum;
			

			}else {
				sum = 0;
				//start = i;
			}
			i++;
			System.out.println("final "+' '+start+' '+end);

		}
		System.out.println(" final final "+' '+start+' '+end);





	}

}
