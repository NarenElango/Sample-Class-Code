package org.college;

public class Hostel implements College, Student {
	public void hostelName() {
		System.out.println("Hostel Name : kings Hostel");

	}

	@Override
	public void studentName() {
		System.out.println("Student Name : Narendhiran");
	}

	@Override
	public void studentDepartment() {
		System.out.println("Department Name : AERONAUTICAL");
	}

	@Override
	public void studentId() {
	System.out.println("Student Id : 232789");
	}

	@Override
	public void collegeName() {
	System.out.println("College Name : YXZ College " );
	}

	@Override
	public void collegeCode() {
		// TODO Auto-generated method stub

	}

}
