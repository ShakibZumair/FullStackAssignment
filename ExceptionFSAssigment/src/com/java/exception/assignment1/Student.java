package com.java.exception.assignment1;

public class Student {
	int rollno;
	 String sname;
	String saddress;
	StudentMarks srobj;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public StudentMarks getSrobj() {
		return srobj;
	}
    public void setSrobj(StudentMarks srobj) {
		this.srobj = srobj;
	}
	//	public void setSrobj(StudentResult srobj) {
//		float f=srobj.getResult();
//        if(srobj.getResult()>=40) {
//        	System.out.println("Congratulation you are passed");
//        }else
//        	System.out.println("Sorry you are Failed!");
//		this.srobj = srobj;
//	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + ", srobj=" + srobj + "]";
	}
	
}
