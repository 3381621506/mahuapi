package org.cskj.springbootStudent.service.impl;



import java.util.List;

import org.cskj.springbootStudent.bean.Course;
import org.cskj.springbootStudent.bean.Student;
import org.cskj.springbootStudent.mapper.CourseMapper;
import org.cskj.springbootStudent.mapper.StudentMapper;
import org.cskj.springbootStudent.service.CourseService;
import org.cskj.springbootStudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseMapper courseMapper;
	@Override
	public List<Course> queryCourseAll() {
		// TODO Auto-generated method stub
		return courseMapper.queryCourseAll();
	}
	
	

}
