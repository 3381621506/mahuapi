package org.cskj.springbootStudent.service.impl;

import java.util.List;

import org.cskj.springbootStudent.bean.Student;
import org.cskj.springbootStudent.mapper.StudentMapper;
import org.cskj.springbootStudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper studentMapper;
	@Cacheable(cacheNames = "stu")
	@Override
	public List<Student> queryStudentAll() {
		// TODO Auto-generated method stub
		return studentMapper.queryStudentAll();
	}
	@Override
	public Student login(Student stu) {
		// TODO Auto-generated method stub
		return studentMapper.login(stu);
	}
	@Override
	public int addStudent(Student stu, String[] cids) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			studentMapper.addStudent(stu);
			int sid = stu.getSid();
//			System.out.println(sid);
			
			for (String st : cids) {
				System.out.println(sid);
				System.out.println(st);
				studentMapper.addStuCou(sid,st);
			}
			i = 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return i;
	}	

}
