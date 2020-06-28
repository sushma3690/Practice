package DesignPat.AFP;
import java.util.Calendar;
import java.util.Locale;

interface PopularBook{
	 void getBook();
}

class FictionBook implements PopularBook{

	@Override
	public void getBook() {
		// TODO Auto-generated method stub
		System.out.println( "I am the likes of Sydney Sheldon");
	}

	@Override
	public String toString() {
		return "FictionBook []";
	}
	
	
	
}

class MagicBook implements PopularBook{

	@Override
	public void getBook() {
		// TODO Auto-generated method stub
		System.out.println( "I am the liked of Wizar of Oz");
	}
	
	
}

class AlgorithmBook implements PopularBook{

	@Override
	public void getBook() {
		// TODO Auto-generated method stub
		System.out.println( "I am the likes of CLRS");
	}
	
}
class PopularBookFactory{
   public static PopularBook getBook(String bookType) {
	   if(bookType == null) {
		   return null;
	   }else if(bookType.equals("Magic")) {
		   return new MagicBook();
	   }else if(bookType.equals("Algo")) {
		   return new AlgorithmBook();
	   }else if(bookType.equals("Fiction")) {
		   return new FictionBook();
	   }
	return null;
   }
   

	
}
public class FactoryDriver {
	
	public static void main(String[] args) {
		PopularBook pb = PopularBookFactory.getBook("Magic");
		pb.getBook();
		PopularBook pb1 = PopularBookFactory.getBook("Algo");
		pb1.getBook();
		PopularBook pb2 = PopularBookFactory.getBook("Fiction");
		pb2.getBook();
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance(Locale.ENGLISH); // FP
		

	}
	

}
