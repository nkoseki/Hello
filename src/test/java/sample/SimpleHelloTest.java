package sample;

import org.junit.Test;

import junit.framework.TestCase;

public class SimpleHelloTest extends TestCase {

	@Test
	public void testFirst(){
		sample.SimpleHello hello = new sample.SimpleHello();
		hello.setId(10);
		assertEquals(1, hello.getId());
		
	}
}
