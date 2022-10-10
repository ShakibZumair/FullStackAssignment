package com.java.exception.assignment1;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		

			Scanner sc = new Scanner(System.in);


			Student s = new Student();
			System.out.println("Enter student rollNo:");
			Integer rollno = sc.nextInt();
			s.setRollno(rollno);
			System.out.println("Enter student name:");
			String sname = sc.next();
			s.setSname(sname);
			System.out.println("Enter student address:");
			String sAddr = sc.next();
			s.setSaddress(sAddr);
			


			StudentMarks sr = new StudentMarks();
			System.out.println("Enter maths marks:");
			float mathMarks =sc.nextFloat();
			sr.setMathematics(mathMarks);
			System.out.println("Enter Physics marks :");
			float physicsMarks =sc.nextFloat();
			sr.setPhysics(physicsMarks);
			System.out.println("Enter Chemistry marks :");
			float chemMarks =sc.nextFloat();
			sr.setChemestry(chemMarks);
			System.out.println("Enter Hindi marks :");
			float hindiMarks =sc.nextFloat();
			sr.setChemestry(hindiMarks);
			System.out.println("Enter English marks :");
			float englishMarks =sc.nextFloat();
			sr.setChemestry(englishMarks);
			s.setSrobj(sr);
			
			float total=(mathMarks+physicsMarks+chemMarks+hindiMarks+englishMarks)*100;
			float avg=total/500;
			System.out.println("Avg:"+avg);
			try{
				
			if(mathMarks <0)
			{
				throw new ResultException("Negative marks not allowed");
			}else if(physicsMarks<0)
			{
				throw new ResultException("Negative marks not allowed");
			}else
			{
		
			}if(avg < 40)
			{
				throw new ResultException("Student failed");
			}else
			{
				System.out.println("student passed");
			}
			
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}

}
 
