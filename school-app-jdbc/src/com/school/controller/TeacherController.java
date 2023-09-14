package com.school.controller;


import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class TeacherController {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setId(3);
		teacher.setName("rayy");
		teacher.setEmail("rayy12@gmail.com");
		
		
	    TeacherService teacherService = new TeacherService();
	        Teacher s = teacherService.saveTeacher(teacher);
	    if(s!=null) {
	    	System.out.println(s.getId() + " saved sucessfully");
	    }
	}

}
