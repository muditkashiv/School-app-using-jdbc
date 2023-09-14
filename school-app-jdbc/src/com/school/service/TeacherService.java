package com.school.service;

import com.school.dao.TeacherDao;

import com.school.dto.Teacher;

public class TeacherService {
	TeacherDao teacherDao = new TeacherDao();
	
	
	
	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
		
	}
	
	public boolean teacherDeleteById(int id) {
		return teacherDao.teacherDeleteById(id);
	}
	
	public Teacher updateTeacher(Teacher teacher) {
		return teacherDao.updateTeacher(teacher);
	}
	public int getTeacher(int id) {
		return teacherDao.getTeacher(id);
	}
	public void getAllTeacher() {
		teacherDao.getAllTeacher();
		
	}
	



	
}
