package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		String name="Yaazhini";
		System.out.println("studentName:"+name);
	}
	public void studentDept() {
		String dept="Computer Science";
		System.out.println("student Dept:"+dept);
		
	}
	public void studentId() {
		int id=2021;
		System.out.println("student ID:"+id);
		
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentId();
		stu.studentName();
		stu.studentDept();
		
	}
}
