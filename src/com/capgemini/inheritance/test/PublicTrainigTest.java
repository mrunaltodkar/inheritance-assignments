package com.capgemini.inheritance.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.PublicTraning;
import com.capgemini.inheritance.main.Training;

class PublicTrainigTest {

	Training publicTraining;

	@BeforeEach
	public void setUp() {
		publicTraining = new PublicTraning(101, "java", 20000, 10);
	}

	@Test
	public void testForValidInput() {
		assertEquals(200000, publicTraining.getOrderValue(), 0.01);
	}

}
