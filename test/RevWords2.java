package test;

public class RevWords2 {
	
	 public String reverseWords(String s) {
		 String[] sArray = s.split(" ");
		 String res="";
		 for(int i = 0; i < sArray.length; i++) {
			  String word = sArray[i];
			  System.out.println(word);
			  int j = 0;
			  int k = word.length()-1;
			  String[] wordArray = word.split("");
			  while(j < k) {
				  String a = wordArray[j];
				  String b = wordArray[k];
				  String temp=a;
				  wordArray[j]=b;
				  wordArray[k]=temp;
				  j++;
				  k--;
			  }
			  String newWord="";
			  for(int l = 0; l < wordArray.length; l++) {
				  newWord=newWord+wordArray[l];
			  }
			  res = res+newWord+" ";
		 }
		return res.trim();
		 
	 }
	 public static void main(String[] args) {
		 RevWords2 rev = new RevWords2();
		 System.out.println(rev.reverseWords("Let's take LeetCode contest"));
	 }

}
