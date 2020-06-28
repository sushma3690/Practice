package DesignPat.struct.Bridge;

public class Main {

	public static void main(String[] args) {
		Payment order = new CardPayment();
		order.paymentSystem = new CitiPaymentSystem();
		order.makePayment();
		
		order.paymentSystem = new IDBIPaymentSystem();
		order.makePayment();
		
		
	   order = new NetBankingPayment();
		order.paymentSystem = new CitiPaymentSystem();
		order.makePayment();
		
		order.paymentSystem = new IDBIPaymentSystem();
		order.makePayment();
		
		/***
		 * recognizeable by creational methods taking an instance of different abstract/interface type and returning an implementation of own abstract/interface type which delegates/uses the given instance
		 */
		/*
		 *  A fictive example would be new LinkedHashMap(LinkedHashSet<K>, List<V>) which returns an unmodifiable linked map which doesn't clone the items, but uses them. The java.util.Collections#newSetFromMap() and singletonXXX() methods however comes close.
		 */
	}
}
