package jnuitExamples;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
public class TestJunit {
	String message = "HelloWorld";	
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Before
	public void testBefore() {
		System.out.println("before");
	}
	
	@Test
	public void testPrintMessage() {	  
		assertEquals(message,messageUtil.printMessage());
	}
}
