package com.klu.service.impl;
import java.util.List;
import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.klu.model.Student;
import com.klu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	
	List<Student> studentList=new ArrayList<>();
	//Welcome messsage
	@Override
	public String getWelcomeMessage()
	{
		return "Welcome to Student MVC";
	}
	
	
	//Create 
	@Override
	public Student createStudent(Student student) {
		studentList.add(student);
		return student;
	}
	
	
	//getStudent by id
	
	@Override 
	public Student getStudentById(int id) {
		for(Student s:studentList) {
			if(s.getId()==id)
				return s;

		}
		return null;
	}
	
	
	//get all students
	
	@Override
	public List<Student> getAllStudents(){
		return studentList;
	}
	
	@Override
	public Student updateStudent(int id,Student student) {
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getId()==id)
			{
				student.setId(id);
				studentList.set(i,student);
				return student;
			}
				
		}
		return null;
	}
	
	
	//delete
	@Override
	public String deleteStudent(int id) {
		for(Student s:studentList)
		{
			if(s.getId()==id) {
				studentList.remove(s);
				return "Student record deleted successfully";
			}
		}
	return "No student record found";
	}
	
	
	//
	@Override
	public List<Student> searchStudent(String name, String course){
		List<Student> result=new ArrayList<>();
		for(Student s:studentList) {
			if(s.getName().equalsIgnoreCase(name)==name&&s.getCourse()==course) {
				result.add(s);
				
			}
		}
		return result;
	}
}