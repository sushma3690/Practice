package DesignPat.struct.Flyweight;

import java.util.HashMap;

public class AttendeeFactory {
	 private static final HashMap<String,AttendanceImpl> attendees = new HashMap();
	 
	static public AttendanceImpl getAttendee(String name) {
		 AttendanceImpl impl = attendees.get(name);
		 if(impl == null) {
			 impl = new AttendanceImpl(name);
			 attendees.put(name, impl);
             System.out.println("Creating a new attendee: " + name);
		 }
		return impl;
	 }
	 
	 
}
