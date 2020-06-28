package DesignPat.struct.proxy;

public class Main {
	
	public static void main(String[] args) {
		ProxyMediaImpl impl = new ProxyMediaImpl("trial");
		impl.printName();
		impl.printName();
	}

}
