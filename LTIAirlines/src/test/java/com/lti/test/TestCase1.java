package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {

	@Test
	public void testAdd() {
		//test data
		int num1=10;int num2=10;
		//assertEquals(70, Main.add(num1, num2));  //checks wheter 2 values are equal
		assertTrue(Main.compare(2,2));
	}
	
	
//	@Test
//	public void test2() {
//		assertTrue(Main.compare(2,2));
//	}
	
	@Test
	public void testObjects() {
		Flight f1=new Flight(1001,"Mumbai","Delhi");
		Flight f2=new Flight(1001,"Mumbai","Delhi");
		//Flight f2=f1;
		assertEquals("Objects are",f1, f2); //messages can be passed if error occurs
	}
	
	
	

}
