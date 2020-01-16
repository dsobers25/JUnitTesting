package guru99.tutorial.junit.two;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyFirstTestClass {
	
	@Test
	public void myFirstMethod() {
		String str= "JUnit is working fine";
		assertEquals("JUnit is working fine", str);
	}

}
