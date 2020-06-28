package DesignPat.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflection {

	
	public static void main(String[] args) throws Exception {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = null;
		
		Constructor[] singletonConst = Singleton.class.getDeclaredConstructors();
		int i =0;
		while(true) {
			singletonConst[0].setAccessible(true);
			s2 = (Singleton) singletonConst[0].newInstance();
			break;
		}
		System.out.println(s1==s2); // broken hence enum
		/***
		 * since enums have no constructrs accesible to programmer and hence
		 * cant be ised  y reflection.JVM instantoates enum only once.
		 * only prob enum cant be lazy instantoated, u have the instance 
		 * upfront
		 */
	}
}
