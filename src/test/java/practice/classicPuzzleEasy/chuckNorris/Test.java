package practice.classicPuzzleEasy.chuckNorris;

import org.testng.Assert;

import practice.classicPuzzleEasy.chuckNorris.Solution;

public class Test {

	@org.testng.annotations.Test
	public void test() {
		String c = Solution.solve("C");
		System.out.println(c);
		Assert.assertTrue("0 0 00 0000 0 00".equals(c));
		String cc = Solution.solve("CC");
		System.out.println(cc);
		Assert.assertTrue("0 0 00 0000 0 000 00 0000 0 00".equals(cc));
		String p = Solution.solve("%");
		System.out.println(p);
		Assert.assertTrue("00 0 0 0 00 00 0 0 00 0 0 0".equals(p));
		String chuck = Solution.solve("Chuck Norris' keyboard has 2 keys: 0 and white space.");
	}
}
