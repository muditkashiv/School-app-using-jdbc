package com.school.controller;

//import com.mysql.cj.protocol.Resultset;

//import com.school.dto.Student;
import com.school.service.StudentService;

public class TestGetAll {
	public static void main(String[] args) {
//		Student student = new Student();.setId(1);
		StudentService studentService = new StudentService();
		
		studentService.getStudent(1);
				
				
	}

}
