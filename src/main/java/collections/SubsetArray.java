package collections;

import java.util.ArrayList;

import java.util.List;

public class SubsetArray {

	public static void main(String[] args) {

		int sum = 10;
		int[] nums = { 1, 2, 3, 4, 5, 6, 10 };
		List<List<Integer>> subsets = subsets(nums);

		for (List<Integer> subset : subsets) {
			if (sum == sumOfList(subset)) {
				System.out.println(subset);
			}
		}
	}

	private static int sumOfList(List<Integer> list) {
		return list.stream().reduce(0, Integer::sum);
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		subsetsHelper(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private static void subsetsHelper(List<List<Integer>> list, List<Integer> resultList, int[] nums, int start) {
		list.add(new ArrayList<>(resultList));
		for (int i = start; i < nums.length; i++) {
			// add element
			resultList.add(nums[i]);
			// Explore
			subsetsHelper(list, resultList, nums, i + 1);
			// remove
			resultList.remove(resultList.size() - 1);
		}
	}

}