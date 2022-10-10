package com.java.exception.assignment1;

public class StudentMarks {
	private float Physics;
	private float Mathematics;
	private float Chemestry;
	private float English;
	private float Hindi;
	public float getPhysics() {
		return Physics;
	}
	public void setPhysics(float physics) {
		Physics = physics;
	}
	public float getMathematics() {
		return Mathematics;
	}
	public void setMathematics(float mathematics) {
		Mathematics = mathematics;
	}
	public float getChemestry() {
		return Chemestry;
	}
	public void setChemestry(float chemestry) {
		Chemestry = chemestry;
	}
	public float getEnglish() {
		return English;
	}
	public void setEnglish(float english) {
		English = english;
	}
	public float getHindi() {
		return Hindi;
	}
	public void setHindi(float hindi) {
		Hindi = hindi;
	}
	@Override
	public String toString() {
		return "StudentResult [Physics=" + Physics + ", Mathematics=" + Mathematics + ", Chemestry=" + Chemestry
				+ ", English=" + English + ", Hindi=" + Hindi + "]";
	}
     
	
	
	

}
