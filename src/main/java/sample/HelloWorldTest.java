package sample;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

	public void testNum(){
		assertEquals(10, sample.HelloWorld.num());
		//assertEquals("10でない", 4, sample.HelloWorld.num());
		
	}
	
}
