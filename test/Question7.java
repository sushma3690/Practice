
public class Question7 {
	
	  public static void main(String args[]) {
	        String a = "Fiction";
	        String b = "Non-Fiction";
	        String c = "Fables";

	        //case 1
	        if (a == "Fiction") {
	            System.out.println("String literal Comparision can be done using == ?"+(a == "Fiction"));
	        }
	        
	        //case:
	        if (a.equals("Fiction")) {
	            System.out.println("String comparision can be done using equals"+(a.equals("Fiction")));
	        }

	        //case 2
	        String d = new String("Fiction");
	        if (a != d) {
	            System.out.println("String liternal and new String Object Comparision canb be done"
	            		+ "using == ? "+ (a!=d));
	        }

	        //case 3
	        String e = new String("HP");
	        String f = new String("HP");
	        if (e != f) {
	            System.out.println("Two String has same content but pointing to different object");
	        }

	       /**
	        * String intern
	        */

	         
	        String s2 = a.intern();  
	        String s3 = new String("Fiction");  
	        String s4 = s3.intern();          
	        System.out.println(a==s2); // True  
	        System.out.println(a==s3); // False  
	        System.out.println(a==s4); // True       
	        System.out.println(s2==s3); // False  
	        System.out.println(s2==s4); // True        
	        System.out.println(s3==s4); // False  


	    }

}
