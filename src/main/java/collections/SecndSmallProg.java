package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecndSmallProg {

	public static void main(String[] args) {
		smallNum();
		System.out.println("int main");
	}

	public static void smallNum() {
		System.out.println("int smallNum method");

		Integer[] num = { 4, 1, 2, 3 };

		// ArrayList<Integer> list = new ArrayList<>();

		Map<Integer, Integer> smallCount = new HashMap<>();
		Integer count = 0;

		for (int a = 0; a <= num.length - 1; a++) {
			int temp = num[a];
			// System.out.println(temp);
			for (int b = 0; b <= num.length - 1; b++) {
				System.out.println("temp number is " + temp + " other number is " +num[b]);
				
				if (temp < num[b]) {
					System.out.println("inside 2nd for loop if condition");
					smallCount.put(temp, count++);

				}
				else if(temp==num[b]) {
					
				}
				else {
					smallCount.put(temp, 0);

				}

			}
			System.out.println(" ");

		}
		System.out.println(smallCount.entrySet());

		for (Entry entry : smallCount.entrySet()) {

			if (entry.getValue().equals(2)) {
				System.out.println("The 2nd smallest number in list is: " + entry.getKey());
			}

		}
	}

}
