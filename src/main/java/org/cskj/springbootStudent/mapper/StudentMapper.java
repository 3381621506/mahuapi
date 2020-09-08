package org.cskj.springbootStudent.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cskj.springbootStudent.bean.Student;
@Mapper
public interface StudentMapper {
	List<Student> queryStudentAll();
	Student login(Student stu);
	void addStudent(Student stu);
	void addStuCou(int sid, String st);
}
