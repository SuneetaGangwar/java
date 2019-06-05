package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateItems {

	public static void main(String[] args) {

		retrieveValuesUsingArrayListMethod2();

	}

	public static void retrieveValuesFromArrayMethod1() {

		// program1 : loop over an array and comparing each element to every other
		// element.
		// For doing this, we are using two loops, inner loop, and outer loop.
		Integer data[] = { 1, 2, 3, 6, 7, 1, 3, 9, 4 };

		for (int a = 0; a < data.length; a++) {

			for (int b = a + 1; b < data.length; b++) {

				if (data[a].equals(data[b])) {

					System.out.print(data[a] + " ");
				}

			}

		}

	}

	public static void retrieveValuesUsingArrayListMethod2() {

		// program2 : loop over an arrayList and comparing each element to every other
		// element.
		// For doing this, we are using two loops, inner loop, and outer loop.
		ArrayList<Integer> data1 = new ArrayList<Integer>();

		data1.add(1);
		data1.add(2);
		data1.add(1);
		data1.add(4);
		data1.add(2);

		/*
		 * Iterator<Integer> iter = data1.iterator(); while (iter.hasNext()) {
		 * System.out.print(iter.next());
		 * 
		 * }
		 */

		for (int a = 0; a < data1.size(); a++) {

			for (int b = a + 1; b < data1.size(); b++) {

				if (data1.get(a).equals(data1.get(b))) {

					System.out.println("duplicate values are: " + data1.get(a) + " ");
				}

			}

		}
	}

	public static void retrieveValuesUsingHasMapMethod3() {

	}
}
