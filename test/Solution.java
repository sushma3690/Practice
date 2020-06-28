package test;

public class Solution {
	public String sumTwoStrings(String first, String second){
		StringBuilder res = new StringBuilder("");
		char prev='0';
		int diff = first.length()-second.length();
		for(int i = first.length()-1; i >= 0; i--){

			if(i-diff >=0 && first.charAt(i)=='1'  && second.charAt(i-diff)=='1'){
				System.out.println("Here1");
				if (prev=='0'){
					res = res.append("0");

				}else{
					res=res.append("1");
				}
				prev='1';
			}

			else if(i-diff >=0 && (first.charAt(i)=='0' && second.charAt(i-diff)=='1' || first.charAt(i)=='1' && second.charAt(i-diff)=='0')){
				System.out.println("Here2");
				if (prev=='0'){
					res = res.append("1");
					prev='0';

				}else{
					res=res.append("1");
					prev='1';

				}
			}
			else  if(i-diff >=0 && (first.charAt(i)=='0' && second.charAt(i-diff)=='0' || first.charAt(i)=='0' &&   second.charAt(i-diff)=='0')){
				System.out.println("Here3");
				if (prev=='0'){
					res = res.append("0");

				}else{
					res=res.append("1");
					prev='0';

				}
			}else {
				System.out.println("Here4");
				if (prev=='0'){
					res = res.append(first.charAt(i));

				}else{
					if(first.charAt(i) == '1') {
						prev='1';
						res = res.append("0");
					}else {
						prev='0';
						res = res.append("1");
					}
					

				}
				if(i==0 && prev=='1') {
					res=res.append("1");
				}
			}
            if(i==0 && i==i-diff) {
            	if(prev=='1') {
            		res = res.append("1");
            	}
            }

		}
		return res.reverse().toString();
	}


	public String addBinary(String a, String b) {
		String res = "";
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();
		if((b == null || b.isEmpty()) && a != null){
			return a;
		}else if(a == null || a.isEmpty() && b != null){
			return b;
		}

		if(a.length() > b.length()){
			System.out.println("here");
			res = sumTwoStrings(a,b);
		}else{
			res = sumTwoStrings(b,a);
		}

		return res;


	}

}
