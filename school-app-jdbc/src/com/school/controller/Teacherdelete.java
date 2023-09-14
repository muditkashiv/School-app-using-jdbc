package com.school.controller;

import com.school.service.TeacherService;

public class Teacherdelete {
	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		teacherService.teacherDeleteById(1);
	}

}
