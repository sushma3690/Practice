package DesignPat.Behave.Visitor;

public class NotePad implements Item{
	private int price;
    private int numberOfPages;

	
	NotePad(int price, int numberOfPages ){
		this.price = price;
		this.numberOfPages = numberOfPages;
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
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	

}
