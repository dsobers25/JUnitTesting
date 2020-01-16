package guru99.tutorial.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestJunit {
//	@Test
//	public void testSetup() {
//		String str= "I am done with Junit setup";
//	    assertEquals("I am done with Junit setup",str);
//	   }

	@Test
	public void testBoolean() {
		boolean b = false;
		assertFalse("b is false", b);
	}
}



