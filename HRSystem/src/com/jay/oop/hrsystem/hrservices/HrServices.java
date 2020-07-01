package com.jay.oop.hrsystem.hrservices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.jay.oop.hrsystem.Employee;

public class HrServices {
		List<Employee> employees = new ArrayList<Employee>();
		
		public  void addEmployee(Employee e)
		{
			employees.add(e);
			employees.forEach(System.out::println);
		}
		public void removeEmployee(int employeeId)
		{
			for(Employee e: employees)
			{
				if(e.getEmpId()==employeeId) {
					employees.remove(e);
					break;
					 
				}
				employees.forEach(System.out::println);
			}
			
		}
		
		public void searchEmployee(String empFirstName, String empLastName){
			for(Employee emp: employees) {
				
				//employees.stream().filter(x->x.getEmpFirstName().equalsIgnoreCase(empFirstName)&&x.getEmpLastName().equalsIgnoreCase(empLastName)).forEach(System.out::println);
				
				if(emp.getEmpFirstName().equalsIgnoreCase(empFirstName)&&emp.getEmpLastName().equalsIgnoreCase(empLastName)) {
					employees.forEach(System.out::println);
					
					
				}
			
				 else { 
					 System.out.println("User not fount!");
				 }
			}
		}
				 
				
			
		
		
		public void searchEmployee(int empId) {
			for(Employee j: employees) {
				if(j.getEmpId()==empId) {
					employees.forEach(System.out::println);
				}
				else {
					System.out.println("User not found");
				}
			}
		}
}

