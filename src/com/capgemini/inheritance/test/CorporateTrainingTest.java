package com.capgemini.inheritance.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.CorporateTraining;
import com.capgemini.inheritance.main.Training;

class CorporateTrainingTest {

	Training corporateTraining;

	@BeforeEach
	public void setUp() {
		corporateTraining = new CorporateTraining(101, "java", 10000, 50);
	}

	@Test
	public void testForValidInput() {
		assertEquals(500000, corporateTraining.getOrderValue(), 0.01);
	}

}
