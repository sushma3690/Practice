package test;

public class ContinuousSum1 {
	
	public static void main(String[]  args) {
		int[] a = {-1,1,-3,8,-1,-1,-1,-3,-1};
		int max=a[0];
		int sum=0;
		int start,end,temp;
		start=temp=end=0;
		for(int i = 0; i < a.length; i++) {
			sum = sum+a[i];
			if(sum > max) {
				max=sum;
				start=temp;end=i;
			}else {
				sum = 0;
				temp=i+1;
			}
		}
		System.out.println(" start "+start);
		System.out.println(" end "+end);
		System.out.println(" max "+max);


	}

}
