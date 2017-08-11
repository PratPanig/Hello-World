import java.util.ArrayList;

public class SumOfTwoArrays {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 5, 8 };
		int[] b = { 2, 3, 4, 5, 6, 7, 8, 9 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		int lena = a.length;
		int lenb = b.length;
		int minLen = lena < lenb ? lena : lenb;
		for (int x = 0; x < minLen; x++) {
			int sum = a[x] + b[x];
			if (sum > 10) {
				al.add(sum / 10);
				al.add(sum % 10);
			} else
				al.add(sum);
		}
		if (minLen == lena) {
			for (int x = minLen; x < lenb; x++) {
				al.add(b[x]);
			}
		} else {
			for (int x = minLen; x < lena; x++) {
				al.add(a[x]);
			}
		}

		System.out.println(al);
	}
}
