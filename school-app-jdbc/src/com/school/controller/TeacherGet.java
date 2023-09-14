package com.school.controller;

import com.school.service.TeacherService;

public class TeacherGet {
	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		teacherService.getTeacher(1);
	}

}
