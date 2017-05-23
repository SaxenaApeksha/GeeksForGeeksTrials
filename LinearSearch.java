public class LinearSearch {

	public static void main(String[] args) {
		int x = 8;
		boolean flag = false;
		int input[] = { 2, 4, 6, 1, 3, 8 };
		linearSearch(input, x, flag);
	}

	private static void linearSearch(int[] input, int x, boolean flag) {
		int location = 0;
		for (int i = 0; i < input.length;) {
			if (x == input[i]) {
				flag = true;
				location = i;
				break;
			} else {
				i++;
			}
		}

		if (flag == true) {
			System.out.println("element is found at: " + (location + 1));
		} else {
			System.out.println("element is not found");
		}

	}

}
