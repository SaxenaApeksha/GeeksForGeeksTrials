public class RotatedArray {

	public static void main(String[] args) {
		int input[] = { 3, 4, 0, 1, 2 };
		int key = 3;
		int l = 0;
		int n = input.length;
		int i = searchRotate(input, l, n - 1, key);
		if (i != -1) {
			System.out.println("element is found at : " + (i + 1));
		} else {
			System.out.println("element is not found !!");
		}
	}

	private static int searchRotate(int[] input, int l, int h, int key) {

		if (l > h)
			return -1;

		int mid = (l + h) / 2;
		if (key == input[mid]) {
			return mid;
		}

		if (input[l] <= input[mid]) {
			if (key >= input[l] && key <= input[mid]) {
				return searchRotate(input, l, mid - 1, key);
			}
			return searchRotate(input, mid + 1, h, key);
		}

		if (key >= input[mid] && key <= input[h]) {
			return searchRotate(input, mid + 1, h, key);
		}
		return searchRotate(input, l, mid - 1, key);
	}

}
