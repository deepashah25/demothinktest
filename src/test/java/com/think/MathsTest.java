package com.think;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
//mockito

@TestInstance(Lifecycle.PER_CLASS)
class MathsTest 
{
	static Maths m1;
	
	public MathsTest() {
		System.out.println("in default");
	}
	
	@BeforeAll
	static void init()
	{
		System.out.println("in init");
		m1=new Maths();
	}

	@Test
	void test() {
		
		int answer=m1.add(10,3);
		int expected=13;
		assertEquals(expected,answer);
		
	}
	
	@Test
	void m2()
	{
		
		//int ans=m1.div(10, 2);
		//assertEquals(5,ans);
		assertThrows(ArithmeticException.class,()->m1.div(10, 0));
		
	}
	
	@Test
	void m3()
	{
		
		assertTrue(m1.isOdd(97));
		
	}

}
