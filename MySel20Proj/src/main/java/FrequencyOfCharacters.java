import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FrequencyOfCharacters {
	static void printFrequency(String test) {
		LinkedHashMap<Character, Integer> lm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < test.length(); i++) {
			char c = test.charAt(i);
			if (lm.containsKey(c))
				lm.put(c, lm.get(c) + 1);
			else
				lm.put(c, 1);
		}
		for (Entry<Character, Integer> me : lm.entrySet()) {
			System.out.println("(" + me.getKey() + "," + me.getValue() + ")");
		}
	}

	public static void main(String[] args) {
		String test = "abbcdc";
		printFrequency(test);
	}
}
