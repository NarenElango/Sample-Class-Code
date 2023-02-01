package org.college;

public class Hostel implements College , Student {
	public void hostelName() {
		System.out.println("Hostel Name : kings Hostel");

	}

	@Override
	public void studentDepartment() {
		System.out.println("Department : AERONAUTICAL");
		
	}

}
