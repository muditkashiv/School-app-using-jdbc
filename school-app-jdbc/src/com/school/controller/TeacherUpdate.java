package com.school.controller;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class TeacherUpdate { 
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("riya");
		teacher.setEmail("riya56@gmail.com");
		TeacherService teacherService = new TeacherService();
		Teacher s =  teacherService.updateTeacher(teacher);
		if(s!= null) {
			System.out.println(s.getId() + "  update sucessfully");
		}
	}


}
