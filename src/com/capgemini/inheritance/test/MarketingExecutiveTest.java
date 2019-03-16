package com.capgemini.inheritance.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.MarketingExecutive;

class MarketingExecutiveTest {

	MarketingExecutive marketingExecutive ;

	@Test
	public void testGrossSalary() {
		marketingExecutive = new MarketingExecutive(101,"Mrunal",15000,3000, 50.5);
		assertEquals(27252.5, marketingExecutive.getGrossSalary(), 0.5);
	}
	
	@Test
	public void testNetSalary() {
		marketingExecutive = new MarketingExecutive(101,"Mrunal",15000,3000, 50.5);
		assertEquals(25252.5, marketingExecutive.getNetSalary(), 0.5);
	}
}
