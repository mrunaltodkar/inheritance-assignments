package com.capgemini.inheritance.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.Employee;

class EmployeeTest {
	
	private Employee employee;
	
	@BeforeEach
	public void setUp() {
		employee = new Employee(101,"Mrunal",15000,3000);
	}
	
	@Test
	public void testEmployeeObjectIsCreatedWithDefaultConstructor() {
		employee = new Employee(); 
		assertNotNull(employee);
	}
	
	@Test
	public void testEmployeeObjectWithParameterisedCOnstructor() {
		Employee employee = new Employee(101,"Mrunal",15000,3000);
		assertNotNull(employee);
		assertEquals(101, employee.getEmployeeId());
		assertEquals("Mrunal", employee.getEmployeeName());
		assertEquals(15000, employee.getBasicSalary());
		assertEquals(3000, employee.getMedical());
	}
	
	@Test
	public void testEmployeeForGrossSalary() {
		assertEquals(25500, employee.getGrossSalary());
	}
	
	@Test
	public void testEmployeeForNetSalary() {
		assertEquals(23500, employee.getNetSalary());
	}

}
