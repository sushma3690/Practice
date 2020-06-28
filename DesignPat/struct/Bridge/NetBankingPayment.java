package DesignPat.struct.Bridge;

public class NetBankingPayment extends Payment{

	@Override
	void makePayment() {
		// TODO Auto-generated method stub
		// invoke corresponding payment gateways @ runtime. for tat invoke ipayment gatewt
		paymentSystem.processPayment("N");
		
	}

}
