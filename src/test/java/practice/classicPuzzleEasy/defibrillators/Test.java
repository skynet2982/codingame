package practice.classicPuzzleEasy.defibrillators;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.testng.Assert;

import practice.classicPuzzleEasy.defibrillators.Solution;

public class Test {

	private static final boolean SOLUTION_OK = true;

	@org.testng.annotations.Test(enabled = SOLUTION_OK)
	public void testSolution() {

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("defibrillateurs/def1.txt"); Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			Assert.assertTrue("Maison de la Prevention Sante".equals(sol));
		} catch (IOException e) {
			Assert.fail(e.getLocalizedMessage());
		}

		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("defibrillateurs/def2.txt"); Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			Assert.assertTrue("Cimetiere Saint-Etienne".equals(sol));
		} catch (IOException e) {
			Assert.fail(e.getLocalizedMessage());
		}
		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("defibrillateurs/def3.txt"); Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			Assert.assertTrue("Caisse Primaire d'Assurance Maladie".equals(sol));
		} catch (IOException e) {
			Assert.fail(e.getLocalizedMessage());
		}
		try (InputStream resourceAsStream = this.getClass().getClassLoader()
				.getResourceAsStream("defibrillateurs/def4.txt"); Scanner sc = new Scanner(resourceAsStream);) {
			String sol = Solution.sol(sc);
			Assert.assertTrue("Amphitheatre d'O".equals(sol));
		} catch (IOException e) {
			Assert.fail(e.getLocalizedMessage());
		}
	}

}
