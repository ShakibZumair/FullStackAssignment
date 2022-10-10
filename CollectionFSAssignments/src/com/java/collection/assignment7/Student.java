package com.java.collection.assignment7;


public class Student {
	private int rollNo;
	private String sname; 
	private String classname;
	private int totalMarks;
	
	
	
	public Student(int rollNo, String sname, String classname, int totalMarks) {
		super();
		this.rollNo = rollNo;
		this.sname = sname;
		this.classname = classname;
		this.totalMarks = totalMarks;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sname=" + sname + ", classname=" + classname + ", totalMarks="
				+ totalMarks + "]";
	}
	
	
}
