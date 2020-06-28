import java.time.Instant;

public class Question13 {

	public static void main(String[] args) {
		Employee e = new Manager();
		Employee e1 = new Employee();
		Manager m = new Manager();
		Employee e2 = new Employee();
		//expecting resepctive salaries -> method hiding
		System.out.println(" when calling getSalary from Manager"+e.getSalary()); //employees
		System.out.println(" when calling getSalary from Manager"+m.getSalary()); //employees

		//expecting managers
		System.out.println(" when calling getAge from Manager"+e.getAge());
		
		System.out.println("get salary 1 "+ e.getSalary1());


		//calling final method in subclass
		long start = System.currentTimeMillis();

		for(int i = 0; i < 100000; i++) {
			e2.calculateSalary1();
			//System.out.println(" when calling calculateSalary from Manager using emp obj "+e2.calculateSalary());
		}
		long end = System.currentTimeMillis();

		System.out.println(" Non final method Finished in "+(end-start));

		long start1 = System.currentTimeMillis();

		for(int i = 0; i < 100000; i++) {
			e.calculateSalary();
			//System.out.println(" when calling calculateSalary from Employee using emp obj "+e1.calculateSalary());

		}
		long end1 = System.currentTimeMillis();

		System.out.println(" Final Finished in "+(end1-start1));





	}
}
