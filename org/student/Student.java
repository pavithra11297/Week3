package org.student;
import org.department.Department;

public class Student extends Department {
	public static void studentName()
	{
		System.out.println("This is studentName method in Student class");

	}
	public static void studentDept()
	{
		System.out.println("This is studentDept method in Student class");

	}
	public static void studentid()
	{
		System.out.println("This is studentid method in Student class");

	}
	public static void main(String[] args)
	{
		Department deptObj=new Department();	
		deptObj.collegeCode();
		deptObj.collegeName();
		deptObj.deptName();
		studentName();
		studentDept();
		studentid();
	}
}
