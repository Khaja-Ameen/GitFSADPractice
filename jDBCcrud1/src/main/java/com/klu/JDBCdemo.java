package com.klu;
import java.sql.*;
import java.sql.DriverManager;

public class JDBCdemo {
 public static void main(String args[]) {
	 String url="jdbc:mysql://localhost:3306/fsads3";
	 String user="root";
	 String password="Pappa)12172510";
	 try {
		 Connection con=DriverManager.getConnection(url,user,password);
		 System.out.println("Database Connection established");
		 
	 }
	 catch(Exception e) {
		 e.printStackTrace();
		
	 }
	
 }
}
