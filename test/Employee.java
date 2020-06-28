import java.io.IOException;
import java.util.List;

public class Employee {
	
	public int age = 30;
	public static double salary = 3000.00;
	final List<Integer> phoneNumbers = null;
	
	//New list, add all the numbers 
	//get -> deep cloning - create a new list and all numners and return new list
	// they can still add numbers to new list
	// E -> Praveen, 3 numbers// state// 
	//Collections.un
	
	
	public int getAge() {
		return age;
	}
	
	public static double getSalary() {
		return salary;
	}
	
	public double calculateSalary() {
		return 300;
	}
	
	public  int getSalary1() {
		return 2;
	}
	
	public  final double calculateSalary1() {
		return 1000;
	}
	
	protected void junk() {
		System.out.println("junk");
	}
	
	public void getDataFromFile() throws IOException {
	}
	public void getDataFromFile2() throws IOException  {
	}
	public void getDataFromFile3() throws Exception  {
	}
	public void getDataFromFile4() throws IOException  {
	}
	
	public Object getDataFromDb() {
		return null;
		
	}
	public Number getDataFromDb1() {
		return null;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
	
	

}
