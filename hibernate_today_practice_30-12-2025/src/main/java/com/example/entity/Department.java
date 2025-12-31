package com.example.entity;
import javax.persistence.*;
@Entity
@Table(name="dept")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String deptname;
	public Department(String deptname) {
		this.deptname=deptname;
	}
	public void setName(String deptname) {
		this.deptname=deptname;
	}
	public 
	
	

}
