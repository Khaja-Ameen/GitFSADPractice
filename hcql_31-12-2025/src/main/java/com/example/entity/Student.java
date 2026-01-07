package com.example.entity;
import javax.persistence.*; 
@Entity
@Table(name="stu")


public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private int marks;
private String name;
public Student(String name,int marks)
{
	
	this.name=name;
	this.marks=marks;
}
public int getId()
{
	return id;
}
public void setMarks(int marks) {
	this.marks=marks;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
	
}
public int  getMarks() {
	return marks;
}
}