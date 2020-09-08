package org.cskj.springbootStudent.bean;

import java.util.List;

public class Student {
	private int sid;
	private String username;
	private String password;
	private String sex;
	private int age;
	private String hobby;
	private List<StuCou> stuCou;
	public Student(int sid, String username, String password, String sex, int age, String hobby, List<StuCou> stuCou) {
		super();
		this.sid = sid;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.hobby = hobby;
		this.stuCou = stuCou;
	}
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public List<StuCou> getStuCou() {
		return stuCou;
	}
	public void setStuCou(List<StuCou> stuCou) {
		this.stuCou = stuCou;
	}
	
	
}
