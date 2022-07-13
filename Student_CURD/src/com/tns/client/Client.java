package com.tns.client;

import java.util.Scanner;

import com.tns.entity.Student;

import com.tns.service.StudentService;
import com.tns.service.StudentServiceImp1;

public class Client 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter Student ID");
		Scanner sc= new Scanner(System.in); 
		int a= sc.nextInt(); 
		   System.out.println("Enter Student Name");
		String b = sc.next();
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImp1();
		
		// Create Operation
		
    student.setStudentId(a);
	student.setName(b);
	service.addStudent(student);
	
	
		
		
	// Retrieve Operation
	//	service.findStudentById(104);
		//System.out.println("ID is: "+student.getStudentid());
		//System.out.println("Name is: "+student.getName());
		
		
		
		//Update Operation
	//	student  =service.findStudentById(1);
		//student.setName("Avantika ");
		//service.updateStudent(student);
		
		
	/*	service.findStudentById(101);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());
		*/
		
		// Delete Operation
	/*	student=service.findStudentById(4);
		service.removeStudent(student);
		System.out.println("Row removed");
		*/
	System.out.println("done");
		
	}

}