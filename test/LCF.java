package test;

public class LCF {
	
	  public static String longestCommonPrefix(String[] strs) {
	        String common="";
	        for(int i = 0; i < strs.length; i++) {
	        	if(i==0) {
	        		common = strs[i];
	        		continue;
	        	}
	        	char[] strArray = strs[i].toCharArray();
	        	for(int j = 0; j < strArray.length;j++) {
	        		boolean allMatch=true;
	        		if(j < common.length() && strArray[j] != common.charAt(j)) {
	        			common=common.substring(0, j);
		        		allMatch=false;
	        			break;
	        		}
	        		if(allMatch && common.length() > strArray.length) {
	        			common = common.substring(0,strArray.length);
	        		}
	        	}
	        }
	        
	        return common;
	        		
	    }
	  
	  public static void main(String[] args) {
		  
		//  String[] strs = {"flower","flow","flight"};
		  String[] strs = {"aa","a"};
		  System.out.println(longestCommonPrefix(strs));
	  }

}
