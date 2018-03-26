package sample;

import org.junit.Test;

import junit.framework.TestCase;

public class SimpleHelloTest extends TestCase {

	@Test
	public void testFirst(){
		sample.SimpleHello hello = new sample.SimpleHello();
		hello.setId(9);
		assertEquals(9, hello.getId());
		
	}
}
