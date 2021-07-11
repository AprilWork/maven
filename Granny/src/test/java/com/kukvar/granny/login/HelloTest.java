package com.kukvar.granny.login;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

	@Test
	public void test() {
		assertEquals(0, 0);
	}
	
	@Test
	public void testAge() {
		Hello hello = new Hello();
		assertEquals(5, hello.getAge());
	}

}
