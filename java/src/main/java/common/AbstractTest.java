package common;

import java.io.InputStream;
import java.util.Scanner;

public abstract class AbstractTest {

	public Scanner loadTestFile(final String fileName) {
		InputStream is = this.getClass().getClassLoader().getResourceAsStream(fileName);
		return new Scanner(is);
	}

}
