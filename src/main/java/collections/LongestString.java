package collections;

public class LongestString {

	public static void main(String[] args) {

		longestStringProg1();

	}

	public static void longestStringProg1() {

		String text = "longestsmnopqrklzyx";

		String[] textArray = text.split("");
		System.out.println(textArray.length);

		StringBuilder longestString = new StringBuilder("");
		StringBuilder finalString = new StringBuilder("");

		int count = 1;
		for (String s : textArray) {
			if (++count > text.length() || longestString.indexOf(s) != -1) {
				if (finalString.length() < longestString.length()) {
					finalString.setLength(0);
					finalString.append(longestString.toString());
				}
				longestString.setLength(0);
				longestString.append(s);

			} else {
				longestString.append(s);
			}

		}

		System.out.println(finalString.toString());

	}

}
