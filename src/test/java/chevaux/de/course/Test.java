package chevaux.de.course;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test {

	private static final boolean SOLUTION_OK = true;

	@org.testng.annotations.Test(enabled = SOLUTION_OK)
	public void testSolution() {

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("chevaux.de.course/1.txt"); Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			assertTrue("1".equals(sol));
		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("chevaux.de.course/2.txt"); Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			assertTrue("1".equals(sol));
		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("chevaux.de.course/3.txt"); Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			assertTrue("47".equals(sol));
		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}
	}
}
