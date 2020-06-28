public class MyCode{
    public static void main(String[] args) {
        Balloon red = new Balloon("Red");
        Balloon blue = new Balloon("Blue");
        swap(red, blue);
        System.out.println("red color="+red.getColor());//red
        System.out.println("blue color="+blue.getColor());//blue
        foo(blue);
        System.out.println("blue color="+blue.getColor());//blue
    }
    private static void foo(Balloon balloon) {
    	//inside a method, they take a copy of ref and not the orif ref
        balloon.setColor("Red");
        balloon = new Balloon("Green");
        balloon.setColor("Blue");
    }
    //Generic swap method
    public static void swap(Object o1, Object o2){
    	//same as above
        Object temp = o1;
        o1=o2;
        o2=temp; // only references are getting exchanged not the values inside references
    }
}
 class Balloon {
    private String color;
    public Balloon(){}
    public Balloon(String c){
        this.color=c;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}