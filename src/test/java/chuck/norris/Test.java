package chuck.norris;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void testStrToBytes() {
		assertTrue("1000011".equals(Solution.stringToBytes("C")));
		assertTrue("10000111000011".equals(Solution.stringToBytes("CC")));
		assertTrue("0100101".equals(Solution.stringToBytes("%")));
	}

	public void c() {
		assertEquals("0 0 00 0000 0 00", Solution.solution("C"));
	}

	public void cc() {
		assertEquals("0 0 00 0000 0 000 00 0000 0 00", Solution.solution("CC"));
	}

	public void percent() {
	}

}
