public class Sorting {
	// Insertion sort has worst-case and average complexity both О(n2), where n
	// is the number of items being sorted
	public static void insertionSort(int[] num) {
		int j; // no. of sorted elements
		int key; // the item to be inserted
		int i;
		for (j = 1; j < num.length; j++) {
			key = num[j];
			for (i = j - 1; i >= 0 && num[i] > key; i--)
				num[i + 1] = num[i];
			num[i + 1] = key;
		}

		for (int x = 0; x < num.length; x++)
			System.out.println("Insertion Sort: " + num[x]);
	}

	// Bubble sort has worst-case and average complexity both О(n2), where n is
	// the number of items being sorted
	public static void bubbleSort(int[] num) {
		boolean flag = true;
		int i, temp;
		while (flag) {
			flag = false;
			for (i = 0; i < num.length - 1; i++) {
				if (num[i] > num[i + 1]) {
					temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
					flag = true;
				}
			}
		}
		for (int x = 0; x < num.length; x++)
			System.out.println("Bubble Sort: " + num[x]);
	}

	// Selection sort has worst-case and average complexity both О(n2), where n
	// is the number of items being sorted
	public static void selectionSort(int[] num) {
		int i, j, first, temp;
		for (i = num.length - 1; i > 0; i--) {
			first = 0;
			for (j = 1; j <= i; j++) {
				if (num[j] > num[first])
					first = j;
			}
			temp = num[first];
			num[first] = num[i];
			num[i] = temp;
		}
		for (int x = 0; x < num.length; x++)
			System.out.println("Selection Sort: " + num[x]);
	}

	public static int binarySearch(int[] num, int start, int end, int key) {
		while (start <= end) {
			int pos = (start + end) / 2;
			if (num[pos] == key)
				return pos;
			else if (num[pos] > key)
				end = pos - 1;
			else
				start = pos + 1;

		}
		return -1;
	}

	public static void main(String args[]) {
		int[] arr = { 67, 69, 76, 84, 89, 91, 94 };
		// insertionSort(arr);
		bubbleSort(arr);
		// selectionSort(arr);
		int x = binarySearch(arr, 0, arr.length, 84);
		if (x == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found in position " + x);
	}
}