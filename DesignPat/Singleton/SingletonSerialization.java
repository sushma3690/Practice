package DesignPat.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerialization  {
public static void main(String[] args) throws Exception {
	
	
	Singleton s1 = Singleton.getInstance();
	String fileName = "chumma.txt";
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
	oos.writeObject(s1);
	System.out.println(" Done writing");
	
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
	Singleton s11 = (Singleton) ois.readObject();
	System.out.println(" Done writing");
	
	System.out.println(s1.hashCode());
	System.out.println(s11.hashCode());
	System.out.println(s1==s11);// readResolve - true, without false
	oos.close();
	ois.close();

}
}
