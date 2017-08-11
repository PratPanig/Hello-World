
public class PushZeroToEnd {

	/**
	 * This O(n) solution iterates over the array with two indexes. If an
	 * element is not 0, we copy it to the position of the first index (and
	 * advance both indexes), if it is a 0 then we only advance the second
	 * index, counting the 0s encountered. When the second index gets to the
	 * end, we will have filled up the non-zero digits at the beginning, so we
	 * just need to make sure to fill the remaining elements at the end with 0s.
	 */
	public static void pushToEnd(int[] number) {
		if (number == null || number.length == 0)
			return;
		int zeros = 0;
		int numIndex = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == 0)
				zeros++;
			else
				number[numIndex++] = number[i];
		}
		for (int i = 0; i < zeros; i++)
			number[numIndex++] = 0;

		for (int i = 0; i < number.length; i++)
			System.out.println(number[i]);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 0, 4, 5, 0, 6, 7, 0, 9 };
		pushToEnd(arr);
	}

}
