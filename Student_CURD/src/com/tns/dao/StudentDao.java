package com.tns.dao;

import com.tns.entity.Student;

public interface StudentDao {
//CRUD operation 
	
	public abstract Student getStudentById(int id); // to retrieve Data

	public abstract  void addStudent(Student student);  //persist
	public abstract  void removeStudent(Student student);
	public abstract  void updateStudent (Student student); //merge
	public abstract  void commiTransaction();
	public abstract  void beginTransaction();
	}  