package com.capgemini.inheritance.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.Manager;

class ManagerTest {

	Manager manager ;

	@Test
	public void testGrossSalary() {
		manager = new Manager(101,"Mrunal",15000,3000);
		assertEquals(29100, manager.getGrossSalary(), 0.01);
	}
	
	@Test
	public void testNetSalary() {
		manager = new Manager(101,"Mrunal",15000,3000);
		assertEquals(27100, manager.getNetSalary(), 0.01);
	}

}
