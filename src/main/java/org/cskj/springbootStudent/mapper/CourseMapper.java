package org.cskj.springbootStudent.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cskj.springbootStudent.bean.Course;

@Mapper
public interface CourseMapper {
	List<Course> queryCourseAll();
	
}
