import java.util.Hashtable;
public class CountCharOccurence {
	public static void main(String[] args) {
		String word = "PROGRAM";
		char[] charArray = word.toCharArray();
		Hashtable<Character, Integer> hashtable = new Hashtable<Character, Integer>();
		for (char c : charArray) {
			System.out.println(c);
			if (hashtable.get(c) != null) {
				hashtable.put(c, hashtable.get(c) + 1);
			} else {
				hashtable.put(c, 1);
			}
		}
		System.out.println(hashtable.entrySet());
	}
}