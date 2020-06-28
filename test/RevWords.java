package test;

public class RevWords {
	
	 public String reverseWords(String s) {
		String[] sArray = s.trim().split(" ");
		String res="";
		int i = 0;
		int j = sArray.length-1;
		while(i < j) {
			
			String temp = sArray[i];
			sArray[i] = sArray[j];
			sArray[j] = temp;
			i++;
			j--;
		}
		
		for(int k = 0; k < sArray.length; k++) {
			if(!sArray[k].isEmpty()) {
				res = res+sArray[k]+" ";
			}
		}
	
		
		return res.trim();
	        
	    }
	 public static void main(String[] args) {
		 RevWords rev = new RevWords();
		 System.out.println(rev.reverseWords("a good   example"));
		 System.out.println(rev.reverseWords("  hello world!  "));

	 }

}
