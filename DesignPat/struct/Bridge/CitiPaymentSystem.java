package DesignPat.struct.Bridge;

//concrete implemntr - need to bind it with net bank/cc, end user doesnt care either this gets
//used or idbi
public class CitiPaymentSystem implements IPayment {

	@Override
	public void processPayment(String paymentSystem) {
		// TODO Auto-generated method stub
		System.out.println(paymentSystem + " using Citi");
		
	}

}
