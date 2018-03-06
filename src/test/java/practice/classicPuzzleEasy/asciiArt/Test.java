package practice.classicPuzzleEasy.asciiArt;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import practice.classicPuzzleEasy.asciiArt.Solution;

public class Test {

	@org.testng.annotations.Test
	public void test() {
		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("ascii.art/asciiArt1.txt"); Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.solve(sc);

		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}
	}

}
