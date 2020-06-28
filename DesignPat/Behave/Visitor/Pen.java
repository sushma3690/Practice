package DesignPat.Behave.Visitor;

public class Pen implements Item{
   private int price;
   private String model;
	
	Pen(int price, String model ){
		this.price = price;
		this.model = model;
	}
	@Override
	public int accept(Visitor visit) {
		// TODO Auto-generated method stub
		return visit.visit(this);
		 
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	

}
