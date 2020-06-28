package DesignPat.Builder;


/******
 * String Builder, Buffer
 * @author karsushm
 *
 */
public class Icecream {
	
	private final String flavor;
	private final String size;
	private final boolean toppings;
	
	Icecream(IcecreamBuilder i){
		this.flavor = i.flavor;
		this.size = i.size;
		this.toppings = i.toppings;
		
	}
	
	public String getFlavor() {
		return flavor;
	}

	public String getSize() {
		return size;
	}

	public boolean isToppings() {
		return toppings;
	}

	static class IcecreamBuilder {
		private final String flavor;
		private final String size;
		private boolean toppings;
		
		IcecreamBuilder(String size, String flavor){
			this.size = size;
			this.flavor = flavor;
		}
		
		IcecreamBuilder IcecreamBuilder(boolean toppings){
			this.toppings = toppings;
			return this;
		}
		
		Icecream build() {
			Icecream ice = new Icecream(this);
			return ice;
			
		}
	}
	
	public static void main(String[] args) {
		Icecream ice = new Icecream.IcecreamBuilder("big","cookies n nut").build();
		System.out.println(ice.size);
		System.out.println(ice.toppings);
				
	}

}
