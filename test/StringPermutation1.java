package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class StringPermutation1 {




static ArrayList<String> result= new ArrayList<>();
	
	public static void main(String[] args) {
		getPermutation("", "ABC");
		//System.out.println(Arrays.toString(result.toArray()));
	}
	
	static void getPermutation(String f, String u){
		if(u.length()==0) {
			System.out.println("result "+f);
			System.out.println(1);
			
		return ;
		}
		     System.out.println("fixed "+f);
		     System.out.println("unifxed "+u);
		     System.out.println(2);
			for(int i=0;i<u.length();i++) {
				System.out.println(3+" "+i);
				System.out.println(3+" "+f);
				System.out.println(3+" "+u.charAt(i));
				System.out.println(3+" "+u);
				String fixed = f + u.charAt(i);
				System.out.println(3+" "+fixed);
				//System.out.println("fxied "+fixed);
				String unFixed = u.substring(0,i)+ u.substring(i+1);
				//System.out.println("unFixed "+unFixed);
				getPermutation(fixed, unFixed);
			}
	
			//return ;
	}


}
