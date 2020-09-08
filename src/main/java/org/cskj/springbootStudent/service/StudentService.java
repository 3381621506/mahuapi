package org.cskj.springbootStudent.service;

import java.util.List;

import org.cskj.springbootStudent.bean.Student;


public interface StudentService {
	List<Student> queryStudentAll();
	Student login(Student stu);
	int addStudent(Student stu, String[] cids);
	
}
