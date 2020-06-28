package DesignPat.struct.Bridge;

//concrete implemntr - need to bind it with net bank/cc, end user doesnt care either this gets
//used or citi
public class IDBIPaymentSystem implements IPayment{

	@Override
	public void processPayment(String paymentSystem) {
		// TODO Auto-generated method stub
		System.out.println(paymentSystem + " using IDBI");

	}

}
