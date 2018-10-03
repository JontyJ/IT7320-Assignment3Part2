import org.junit.Test;

import junit.framework.TestCase;

public class test extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testHello() {
		String hi = "Hello World";
		assertEquals(hi, HelloWorld.hello());
	}

}
