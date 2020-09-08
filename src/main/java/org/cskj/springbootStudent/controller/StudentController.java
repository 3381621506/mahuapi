package org.cskj.springbootStudent.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.cskj.springbootStudent.bean.Student;
import org.cskj.springbootStudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("list")
	public String queryStudentAll(Model model) {
		
		List<Student> list = studentService.queryStudentAll();
//		System.out.println(list);
		model.addAttribute("list",list);
		return "stu/list";
		
	}
	@RequestMapping("login")
	public String login(Student stu,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Student student=studentService.login(stu);
		if(student!=null) {
			System.out.println("成功");
			session.setAttribute("login_success", student.getUsername()+"，你小子脚够长的，敢跑到我的地界来撒野，胆子够大啊。");
			return "redirect:list";
		}else {
			System.out.println("失败");
			session.setAttribute("login_error","赶紧起开！或者圆溜溜的走开！不然等我来收拾你就晚了。");
			return "redirect:login.jsp";
		}
		
	}
	@RequestMapping("addStudent")
	@ResponseBody
	public void addStudent(Student stu ,String[] cids,HttpServletResponse response) throws IOException {
//		System.out.println(stu.getHobby());
		response.setCharacterEncoding("utf-8");
//		for (String string : cids) {
//			System.out.println(cids);
//		}
		int i =studentService.addStudent(stu ,cids);
		response.getWriter().print(i>0);
	}
}
