package chuck.norris;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static String solution(String entry) {
		return null;
	}

	public static String stringToBytes(String str) {
		StringBuilder bui = new StringBuilder();
		if (str.length() > 1) {
			List<String> l = strToList(str);
			for (String s : l) {
				strConvert(bui, s);
			}
		} else {
			strConvert(bui, str);
		}
		System.out.println(bui.toString());
		return bui.toString();
	}

	private static void strConvert(StringBuilder bui, String s) {
		char[] c = s.toCharArray();
		byte[] bytes = new byte[c.length];
		for (int i = 0; i < c.length; i++) {
			bytes[i] = (byte) (c[i] & 0x007F);
		}

		StringBuilder builder = new StringBuilder();
		for (final byte b : bytes) {
			builder.append(b);
		}
		int j = Integer.parseInt(builder.toString());
		String binaryString = Integer.toBinaryString(j);
		if(binaryString.length() < 7) {
			
		}
		
		bui.append(binaryString);
	}

	private static final List<String> strToList(final String str) {
		List<String> list = new ArrayList<>();
		final char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			final char[] a = new char[1];
			a[0] = chars[i];
			list.add(new String(a));
		}
		return list;
	}

}
