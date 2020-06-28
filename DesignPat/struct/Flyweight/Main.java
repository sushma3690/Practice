package DesignPat.struct.Flyweight;

import java.util.Random;

public class Main {
	private static final String[] names = {"David", "Scott", "Andrew", "Rhett"};


	private static String getRandomName() {
		int randomName = new Random().nextInt(names.length);
		return names[randomName];
	}

	private static int getRandomAge() {
		return (int)(Math.random()*80);
	}
	public static void main(String[] args) {
		  for(int i = 0; i < 10; ++i) {
	            AttendanceImpl attendeeImpl = (AttendanceImpl) AttendeeFactory.getAttendee(getRandomName());
	            attendeeImpl.setAge(getRandomAge());
	            attendeeImpl.listenToCourt();
	        }
	}
}
