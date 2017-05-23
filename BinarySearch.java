public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 4, 6, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		int x = 0;

		int low = 0;
		int high = arr.length;

		int med = 0;
		boolean flag = false;

		for (low = 0; low <= high;) {
			med = (low + high) / 2;
			if (med < arr.length) {
				if (x == arr[med]) {
					flag = true;
					break;
				} else if (x > arr[med]) {
					low = med + 1;
				} else {
					high = med - 1;
				}
			} else {
				break;
			}
		}
		System.out.println();
		if (flag == true) {
			System.out.println("element is found at:" + (med + 1));
		} else {
			System.out.println("element is not found");
		}

	}

}
