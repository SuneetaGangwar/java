package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPrac {

	public static void main(String[] args) {
		hashMapProgForDuplicate();

	}

	public static void hashMapProg1() {

		HashMap<Integer, String> hashmap = new HashMap<>();

		hashmap.put(001, "Suneeta");
		hashmap.put(002, "Rahul");

		System.out.println(hashmap);

		for (Map.Entry m : hashmap.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());

		}

	}

	public static void hashMapProgForDuplicate() {

		Integer data[] = { 1, 2, 3, 4, 5, 6, 1, 3, 4 };

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer key : data) {
			Integer count = map.get(key);
			if (count == null) {
				map.put(key, 1);
			} else {
				map.put(key, ++count);
			}

		}
		System.out.println(map.entrySet());

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + " has duplicate values");
			} else {
				System.out.println(entry.getKey() + " does not have duplicate values");
			}

		}

	}

}
