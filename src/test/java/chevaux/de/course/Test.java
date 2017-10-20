package chevaux.de.course;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test {
	@org.junit.Test
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
