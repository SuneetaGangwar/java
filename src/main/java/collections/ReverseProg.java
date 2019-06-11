package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseProg {

	public static void main(String[] args) {

		reverseNumber();
	}

	public static void reverseNumber() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");

		int num = scan.nextInt();
		int temp = num;

		int rem = 0;
		int reversenum = 0;

		while (num > 0) {
			rem = num % 10;
			reversenum = reversenum * 10 + rem;

			num = num / 10;
			System.out.print(rem);

		}

		if (temp == reversenum) {
			System.out.println('\n' + "The number " + temp + " is Palindrome");
		} else {
			System.out.println('\n' + "The number " + temp + " is not Palindrome");
		}

	}

	public static void reverseString() {
		String str = "Suneeta";
		char reverseString = 0;
		System.out.println("The String is: " + str);
		System.out.println("Reverse of String is: ");

		char[] charArray = str.toCharArray();
		for (int a = charArray.length - 1; a >= 0; a--) {
			reverseString = charArray[a];
			System.out.print(reverseString);
		}

		if (str.equals(reverseString)) {
			System.out.println("The String is Palindrome");
		} else {
			System.out.println('\n' + "The String is not Palindrome");
		}

	}

}
