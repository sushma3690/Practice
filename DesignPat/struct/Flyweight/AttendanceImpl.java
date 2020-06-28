package DesignPat.struct.Flyweight;

public class AttendanceImpl  implements Attendance{
	private String name;
	private int age;

	public void setAge(int age) {
		this.age = age;
	}


	AttendanceImpl(String name){
		this.name = name;
	}


	@Override
	public void listenToCourt() {
		System.out.println(this.name +"  listening to "+ this.age);
	}

}
