import java.util.Arrays;

public class MergeTwoSortedArraysIntoThird {
	static int[] mergeTwoSortedArrays(int[] a, int[] b) {
		// Corner cases
		if (a == null && b == null) {
			return null;
		}
		if (a == null) {
			return Arrays.copyOf(b, b.length);
		}
		if (b == null) {
			return Arrays.copyOf(a, a.length);
		}

		// Common cycle
		int[] c = new int[a.length + b.length];

		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
			} else {
				c[k] = b[j];
				j++;
			}
			k++;
		}

		// ends
		if (i == a.length) {
			while (j < b.length) {
				c[k++] = b[j++];
			}
		} else {
			while (i < a.length) {
				c[k++] = a[i++];
			}
		}

		return c;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9, 11, 45, 67 };
		int[] b = { 2, 4, 6, 8, 9, 11, 34, 56, 789, 789, 999, 1000 };
		int[] result = mergeTwoSortedArrays(a, b);

		for (int x : result)
			System.out.print(x + " ");

	}

}
