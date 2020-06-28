package DesignPat.struct.Bridge;

public abstract class Payment {
	IPayment paymentSystem;
	abstract void makePayment();

}
