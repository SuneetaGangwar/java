package javaexcercises;

public class Fibonacci {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		int count = 0;
		while (num1 <= 10) {

			System.out.print(num1 + " ");
			int sum = num1 + num2;

			num1 = num2;
			num2 = sum;

			// 0 1 2 3 4 5 6 7 8 9 10
			// output: 0 1 1 2 3 5 8

			count++;
		}

	}

}
