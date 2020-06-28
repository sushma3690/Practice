package Tricky;

public class Employee implements Comparable {
	
	String Name;
	int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object arg0) {
		Employee e = (Employee)arg0;
		if(e.getAge() < this.getAge()) {
			return -1; //descending order of ages.
		}else if(e.getAge() > this.getAge()) {
			return 1;
		}else if(e.getAge() == this.getAge()) {
			return e.getName().compareTo(this.getName());
		}
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", age=" + age + "]";
	}
	
	
	

}
