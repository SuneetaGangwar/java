package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseInt {

	public static void main(String[] args) {
		reverseProg2();

	}

	public static void reverseProg1() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		System.out.print("actual list is: " + list1 + '\n');

		System.out.println("Reverse of list is: ");
		Collections.reverse(list1);

		for (Integer num1 : list1) {

			System.out.print(num1 + " ");
		}

	}

	public static void reverseProg2() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		System.out.print("actual list is: " + list1 + '\n');

		System.out.println("Reverse of list is: ");

		for (int temp = list1.size() - 1; temp >= 0; temp--) {

			System.out.print(list1.get(temp) + " ");
		}

	}

}
