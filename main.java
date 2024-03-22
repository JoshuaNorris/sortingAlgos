import java.util.ArrayList;



public class main {

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>() {{
			add(3);
			add(35);
			add(12);
			add(16);
			add(12);
			add(7);
			add(0);
		}};
	    System.out.println(insertion_sort(input));
	}

// 7 elements
// [3,35,12,16,12,7,0]

	public static ArrayList<Integer> insertion_sort(ArrayList<Integer> nums) {
		for (int iteration = 1; iteration < nums.size(); iteration ++) {
			int selected_element = nums.get(iteration);
			for (int sorted_section_index = 0; sorted_section_index < iteration; sorted_section_index++) {
				int sorted_element = nums.get(sorted_section_index);
				if (selected_element <= sorted_element) {
					int temp = nums.remove(iteration);
					nums.add(sorted_section_index, temp);
					sorted_section_index = iteration;
				}

			}

		}
		return nums;

	}



	public static ArrayList<Integer> selection_sort(ArrayList<Integer> nums) {
		for (int iteration = 0; iteration < nums.size(); iteration ++) {
			int min_element_index = nums.size() - 1;
			for (int index = nums.size() - 1; index >= iteration; index --) {
				if (nums.get(index) < nums.get(min_element_index)) {
					min_element_index = index;
				}
			}
			int temp = nums.get(iteration);
			nums.set(iteration, nums.get(min_element_index));
			nums.set(min_element_index, temp);
		}
		return nums;

	}



	public static ArrayList<Integer> bubble_sort(ArrayList<Integer> nums) {
		boolean unsorted = true;
			while (unsorted) {
				unsorted = false;
				for (int x = 1; x < nums.size(); x++) {
					if (nums.get(x) < nums.get(x - 1)) {
						int temp = nums.get(x);
					nums.set(x, nums.get(x - 1));
					nums.set(x-1, temp);
					unsorted = true;
				}
			}
		}
		return nums;
	}
}
