package com.example1;
import java.util.*;
import org.hibernate.*;
import com.example.entity.*;
import com.example.util.HibernateUtil;
import org.hibernate.query.Query;

public class MainApp {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	int ch;
	do {
		 System.out.println("\n=== HQL MENU ==="); 
         System.out.println("1. Insert Sample Data"); 
         System.out.println("2. Select - Show All Employees"); 
         System.out.println("3. Update Salary (Positional Parameter)"); 
         System.out.println("4. Delete Employee (Named Parameter)"); 
         System.out.println("5. Sort Employees (ORDER BY Salary)"); 
         System.out.println("6. Aggregate Functions"); 
         System.out.println("0. Exit");
         System.out.println("Enter choice: ");
         ch=sc.nextInt();
         switch(ch) {
         case 1: insertSampleData(); break; 
         case 2: showEmployees(); break; 
         case 3: updateSalary(); break; 
         case 4: deleteEmployee(); break; 
         case 5: sortEmployees(); break; 
         case 6: aggregate(); break;
         }
	}while(ch!=0);

	}

	static void insertSampleData() {
		
	}
}
