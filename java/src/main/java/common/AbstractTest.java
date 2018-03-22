/*
 * Author: Robin Péricé (2018)
 */
package common;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import com.google.common.io.Resources;

public abstract class AbstractTest {

	public Scanner loadTestFile(final String fileName) throws IOException {
		final URL resource = Resources.getResource(fileName);
		final InputStream is = resource.openStream();
		return new Scanner(is);
	}

}
