package org.same;

public class Loop {
	public static void main(String[] args) {

		String s = "Java is Simple";

		String s1 = "";

		String s2 = "";

		String s3 = "";

		String[] s4 = s.split(" ");

		for (int i = s4[0].length() - 1; i >= 0; i--) {
			s1 = s1 + s4[0].charAt(i);
		}
		for (int i = s4[1].length() - 1; i >= 0; i--) {
			s2 = s2 + s4[1].charAt(i);
		}
		for (int i = s4[2].length() - 1; i >= 0; i--) {
			s3 = s3 + s4[2].charAt(i);
		}

		System.out.println(s1 + " " + s2 + " " + s3 + " ");

	}
}
