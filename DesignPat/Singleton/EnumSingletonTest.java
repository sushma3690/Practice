package DesignPat.Singleton;

/***
 * since enums have no constructrs accesible to programmer and hence
 * cant be ised  y reflection.JVM instantoates enum only once.
 * only prob enum cant be lazy instantoated, u have the instance 
 * upfront
 */
enum EnumSingleton {
	   instance;
		
	}

public class EnumSingletonTest {
	
	public static void main(String[] args) {
		EnumSingleton s1 = EnumSingleton.instance;
		EnumSingleton s2 = EnumSingleton.instance;
		System.out.println(s1==s2);

		
	}
	

}
