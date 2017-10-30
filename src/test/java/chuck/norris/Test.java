package chuck.norris;

import org.testng.Assert;

public class Test {

	private static final boolean SOLUTION_OK = false;

	@org.testng.annotations.Test(enabled = SOLUTION_OK)
	public void testStrToBytes() {
		Assert.assertTrue("1000011".equals(Solution.stringToBytes("C")));
		Assert.assertTrue("10000111000011".equals(Solution.stringToBytes("CC")));
		Assert.assertTrue("0100101".equals(Solution.stringToBytes("%")));
	}

	public void c() {
		Assert.assertEquals("0 0 00 0000 0 00", Solution.solution("C"));
	}

	public void cc() {
		Assert.assertEquals("0 0 00 0000 0 000 00 0000 0 00", Solution.solution("CC"));
	}

	public void percent() {
	}

}
