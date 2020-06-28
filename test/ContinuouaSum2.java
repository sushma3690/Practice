package test;

public class ContinuouaSum2 {


	public static void main(String[] args) {
		int[] a = {-1,1,-3,8,-1,-1,-1,-3,-1};
		int max_s_f = a[0];
		int max_e=0;
		int start = 0,end=0, temp = 0;
		
		for(int i = 0; i < a.length; i++) {
			max_e = max_e+a[i];
			if(max_e > max_s_f) {
				System.out.println("here");
				max_s_f = max_e;
				start = temp;
				end = i;
			}
			if(max_e<0) {
				temp=i+1;
				max_e=0;
			}
		}
		System.out.println("end "+end);
		System.out.println("start "+start);
		System.out.println(max_s_f);
		






	}

}
