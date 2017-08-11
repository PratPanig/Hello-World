import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PalindromeOrNot {
	static boolean isPalindrome(String test) {
		LinkedHashMap<Character, Integer> lm = new LinkedHashMap<Character, Integer>();
		int oddCount, evenCount;
		for (int i = 0; i < test.length(); i++) {
			char c = test.charAt(i);
			if (lm.containsKey(c))
				lm.put(c, lm.get(c) + 1);
			else
				lm.put(c, 1);
		}
		oddCount = evenCount = 0;
		for (Entry<Character, Integer> me : lm.entrySet()) {
			if (me.getValue() % 2 == 1)
				oddCount++;
			else
				evenCount++;
		}
		if (test.length() % 2 == 0)
			return oddCount == 0;
		else
			return oddCount == 1;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("mmo"));
		System.out.println(isPalindrome("yakak"));
		System.out.println(isPalindrome("travel"));
		System.out.println(isPalindrome("mmoaabbbcccc"));
	}

}
