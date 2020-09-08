package org.cskj.springbootStudent.bean;

public class StuCou {
	private int id;
	private int score;
	private Student student;
	private Course course;
	public StuCou(int id, int score, Student student, Course course) {
		super();
		this.id = id;
		this.score = score;
		this.student = student;
		this.course = course;
	}
	public StuCou() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
