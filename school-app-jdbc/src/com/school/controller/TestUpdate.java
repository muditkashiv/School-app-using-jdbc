package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class TestUpdate {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setName("aarohi");
		student.setEmail("aarohi@gmail.com");
		StudentService studentService = new StudentService();
	    Student s = studentService.updateStudent(student);
	    if(s!=null) {
	    	System.out.println(s.getId() + " update sucessfully");
	    }
	}

}
