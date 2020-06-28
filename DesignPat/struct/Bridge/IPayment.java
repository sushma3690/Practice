package DesignPat.struct.Bridge;

//Implementr interface
public interface IPayment {
	
	//either netbanking or card
	public void processPayment(String paymentSystem);

}
