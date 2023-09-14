package com.school.service;

//import com.mysql.cj.protocol.Resultset;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
	StudentDao  studentDao = new StudentDao();
	
	
	
	
public Student saveStudent(Student student) {
	return studentDao.saveStudent(student);
		
}
public boolean studentDeleteById(int id) {
	return studentDao.studentDeleteById(id);
}


public Student updateStudent(Student student) {
	return studentDao.updateStudent(student);
}
public int getStudent(int id) {
	return studentDao.getStudent(id);
	
}
public void getAllStudent() {
	studentDao.getAllStudent();
}

}