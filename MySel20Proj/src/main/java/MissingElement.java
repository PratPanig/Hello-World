
public class MissingElement {
	static int missing_element(int arr[], int size) {
		int min_val, max_val;
		int xarr = 0, xacc = 0;

		// Find the minimum and maximum values in the array
		min_val = arr[0];
		max_val = arr[0];
		for (int i = 1; i < size; ++i) {
			if (arr[i] > max_val)
				max_val = arr[i];
			if (arr[i] < min_val)
				min_val = arr[i];
		}

		// Find the XOR'ed value of all numbers from min_val to max_val
		// inclusive
		for (int i = min_val; i <= max_val; ++i) {
			xacc ^= i;
		}

		for (int i = 0; i < size; ++i) {
			xarr ^= arr[i];
		}

		return (xacc ^ xarr);
	}

	public static void main(String[] args) {
		int arr[] = { 8, 13, 5, 10, 6, 7, 9, 12, 14, 11, 16 };
		int miss = missing_element(arr, arr.length);
		System.out.println("MISSING VALUE: " + miss);
	}

}
