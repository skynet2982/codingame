package defibrillateurs;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import defibrillateurs.Solution;

public class Test {

	@org.junit.Test
	public void testSolution() {

		try (InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("defibrillateurs/def1.txt");
				Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			assertTrue("Maison de la Prevention Sante".equals(sol));
		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}
		
		try (InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("defibrillateurs/def2.txt");
				Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			assertTrue("Cimetiere Saint-Etienne".equals(sol));
		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}
		try (InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("defibrillateurs/def3.txt");
				Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			assertTrue("Caisse Primaire d'Assurance Maladie".equals(sol));
		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}
		try (InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("defibrillateurs/def4.txt");
				Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			assertTrue("Amphitheatre d'O".equals(sol));
		} catch (IOException e) {
			fail(e.getLocalizedMessage());
		}
	}

}
