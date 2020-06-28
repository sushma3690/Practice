package PECS;

import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		HashMap<Emplyee , String> hm = new HashMap();
		Emplyee e1 = new Emplyee();
		Emplyee e2 = e1;
		Emplyee e3 =new Emplyee(e1);

		hm.put(e1, "1");
		hm.put(e2, "");
		hm.put(e3, "");

		System.out.println(hm.size());


		
	}

}
