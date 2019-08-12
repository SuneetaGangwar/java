package collections;

import java.util.HashMap;
import java.util.Map;

public class StringNum {

	public static void main(String[] args) {
		// In a sequence of alphabets (like aaabbddaabbcc)
		// write a program to find the number of the consecutive alphabets in and print
		// the alphabet and number.
		// example :if input is aaabbddaabbcc then output should be 3a, 2b, 2d, 2a, 2b,
		// 2c

		prog1();

	}

	static void prog1() {

		String str = "aaabbddaabbcc";
		String[] splitString = str.split("");
		int count = 1;
		String finalString = "";
		for (int i = 0; i < str.length() - 1; i++) {
			if (splitString[i].equals(splitString[i + 1])) {
				++count;

			} else {

				finalString += splitString[i] + count + ", ";
				count = 1;
			}

		}
		System.out.println(finalString);

	}

}
