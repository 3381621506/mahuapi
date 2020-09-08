package org.cskj.springbootStudent.controller;



import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.cskj.springbootStudent.bean.Course;
import org.cskj.springbootStudent.bean.Student;
import org.cskj.springbootStudent.service.CourseService;
import org.cskj.springbootStudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONParser;
import com.alibaba.fastjson.JSON;

@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;
	@RequestMapping("queryCourseAll")
	@ResponseBody
	public void queryStudentAll(HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		List<Course> list = courseService.queryCourseAll();
		String string = JSON.toJSONString(list);
		response.getWriter().print(string);
		
	}
	
}
