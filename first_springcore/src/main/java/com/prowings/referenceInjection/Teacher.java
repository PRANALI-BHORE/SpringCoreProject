package com.prowings.referenceInjection;

public class Teacher {
	private String teacherName;
	private Subject subject;
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", subject=" + subject + "]";
	}
	
	
	
	
}
