package assignment4_exercises.fmt_rewrap;

//Introduction to Software Testing
//Authors: Paul Ammann & Jeff Offutt
//Chapter 7; page ??
//See FmtRewrap.num for a numbered version.
//No JUnit tests at this time.

import assignment4_exercises.Path;

/**
 * *****************************************************
 * Rewraps the string (Similar to the Unix fmt).
 * Given a string S, eliminate existing CRs and add CRs to the
 * closest spaces before column N. Two CRs in a row are considered to
 * be "hard CRs" and are left alone.
 */

public class FmtRewrap {

	static final char CR = '\n';
	static final int inWord = 0;
	static final int betweenWord = 1;
	static final int lineBreak = 2;
	static final int crFound = 3;

	static Path path = new Path();

	public static String fmtRewrap(String S, int N) {
		int state = betweenWord;
		int lastSpace = -1;
		int col = 0;
		int i = 0;
		char c;
		char SArr[] = S.toCharArray();
		path.add(1);
		path.add(2);
		while (i < S.length()) {
			c = SArr[i];
			col++;
			path.add(3);
			path.add(4);
			if (col >= N && lastSpace != -1) {
				state = lineBreak;
				path.add(5);
			} else if (c == CR) {
				state = crFound;
				path.add(6);
				path.add(7);
			} else if (c == ' ') {
				state = betweenWord;
				path.add(6);
				path.add(8);
				path.add(9);
			} else {
				state = inWord;
				path.add(6);
				path.add(8);
				path.add(10);
			}
			path.add(11);
			switch (state) {
				case betweenWord:
					lastSpace = i;
					path.add(12);
					break;

				case lineBreak:
					SArr[lastSpace] = CR;
					col = i - lastSpace;
					path.add(13);
					break;

				case crFound:
					path.add(14);
					if (i + 1 < S.length() && SArr[i + 1] == CR) {
						i++; // Two CRs => hard return
						col = 1;
						path.add(17);
					} else {
						SArr[i] = ' ';
						path.add(18);
					}
					path.add(19);
					break;

				case inWord:
					// nothing
					path.add(15);
				default:
					path.add(16);
					break;
			} // end switch
			i++;
			path.add(20);
			path.add(2);
		} // end while
		S = new String(SArr) + CR;
		path.add(21);
		return (S);
	}

	public static Path getPathForRewrappedString(String string, int N) {
		path = new Path();
		fmtRewrap(string, N);
		return path;
	}
}
