package test;

public class ReverseString {

	public static char[] reverseString(char[] s) {

		int i =0;
		int j = s.length-1;
		while(i <j) {
			char  temp = s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
		return s;

	}

	public static void main(String[] args) {
		char[] res = reverseString(new char[]{'a','b','c','d'});
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
