package test;

public class strStr1 {
	
	  public static int strStr(String haystack, String needle) {
		  if(needle == null || haystack==null) {
			  return -1;
		  }
         if(needle.isEmpty()) {
			  return 0;
		  }
		  if(haystack.length() < needle.length()) {
			  return -1;
		  }
		  
		  boolean found = false;
		  int k =0;
		  int r=0;
		  for(int i = 0; i < haystack.length(); i++) {
			  if(haystack.charAt(i) == needle.charAt(k)) {
				 int diff = i-k;
				// System.out.println(diff);
				 for(int j = needle.length()-1; j >= 0; j--) {
					// System.out.println(needle.charAt(j));
					// System.out.println(haystack.charAt(j+diff));

					 if(j+diff <haystack.length() &&  needle.charAt(j)==haystack.charAt(j+diff)) {
						 found=true;
						 r=j+diff;
						 
					 }else {
						 found=false;
						 break;
					 }
				 }
				 if(found) {
					 break;
				 }
				  
			  }else {
				  found = false;
			  }
		  }
		  if(found) {
			  return r;
		  }
		  
		  return -1;
	    
	  }
	  
	  public static void main(String[] args) {
		 /// System.out.println(strStr("a","a"));
		 System.out.println(strStr("mississippi","issip"));

	  }

}
