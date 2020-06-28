//MUTABLE
// Have an object -> return copy oof the object
class Icecream1{
	private final String color;
	private final String flavor;
	private final String size;
	private final boolean toppings;
	////7


	@Override
	public String toString() {
		return "Icecream1 [color=" + color + ", flavor=" + flavor + ", size=" + size + ", toppings=" + toppings + "]";
	}



	Icecream1(IcecreamBuilder iceBuilder){
		this.color = iceBuilder.color;
		this.flavor = iceBuilder.flavor;
		this.size = iceBuilder.size;
		this.toppings = iceBuilder.toppings;
	}



	public String getColor() {
		return color;
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



	public static class IcecreamBuilder {

		private final String color;
		private final String flavor;
		private String size;
		private boolean toppings;
		IcecreamBuilder(String color, String flavor){
			this.color = color;
			this.flavor = flavor;
		}
		IcecreamBuilder size(String size){
			this.size = size;
			return this;
		}
		IcecreamBuilder toppings(boolean toppings){
			this.toppings = toppings;
			return this;
		}

		public Icecream1 build() {
			Icecream1 icecream = new Icecream1(this);
			//do any valids
			return icecream;

		}

	}
}
public class Question41 {

	public static void main(String[] args) {
		Icecream1 i1 = new  Icecream1.IcecreamBuilder("purple","black current").size("huge").build();
		System.out.println(i1.toString()  );      
	}
	


}
