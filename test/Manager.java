import java.io.FileNotFoundException;
import java.io.IOException;

public class Manager extends Employee {

	protected int age = 40;
	protected static double salary = 4000.00;
	public int getAge() {
		return age;
	}
	
	public void junk() {
		System.out.println("junk");
	}
	public static double getSalary() {
		return salary;
	}
	
	public final int getSalary1() {
		return 1;
	}
	
	public  double calculateSalary() {
		return 1500;
	}
	
	public void getDataFromFile() throws FileNotFoundException  {
	}
	public void getDataFromFile2() throws IOException  {
	}
	public void getDataFromFile3() throws Exception  {
	}
	
	//Below is not allowed for an api call to ths method may not handle exceptions from
	// parent class exceptions parent. Hence exceptions have to be restrictive
	/*
	 * public void getDataFromFile4() throws Exception { }
	 */
	public Integer getDataFromDb() {
		return null;
		
	}
	
	/*
	 * Object superclass to all classes, not alloed
	 * public Object getDataFromDb1() { return null;
	 * 
	 * }
	 */
	
	public Double getDataFromDb1() {
		return null;
		
	}
	
	////========================
	
	
	
}
