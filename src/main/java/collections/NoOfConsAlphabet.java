package collections;

//In a sequence of alphabets (like aaabbddaabbcc)
// write a program to find the number of the consecutive alphabets in and print
// the alphabet and number.
// example :if input is aaabbddaabbcc then output should be 3a, 2b, 2d, 2a, 2b, 2c

public class NoOfConsAlphabet {

	public static void main(String[] args) {
		noOfConsAlph("aaabbccddaabb");

	}

	static void noOfConsAlph(String input) {

		String[] splitString = input.split("");
		String finalOutput = "";
		int count = 1;
		for (int a = 0; a < input.length() - 1; a++) {

			if (splitString[a].equals(splitString[a + 1])) {
				++count;

			} else {
				finalOutput += count + splitString[a] + ", ";
				count = 1;
			}

		}
		System.out.println("original String is: " + input);
		System.out.println("count of consicutive alphabet is: " + '\n' + finalOutput);

	}

}
