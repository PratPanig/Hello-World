
public class StringRotation {
	static boolean isSubstr2Places(String s, String s2) {
		return s2.equalsIgnoreCase(s.substring(2) + s.substring(0, 2))
				|| s2.equalsIgnoreCase(s.substring(s.length() - 2) + s.substring(0, s.length() - 2));
	}

	public static void main(String[] args) {
		System.out.println(isSubstr2Places("amazon", "azonam"));
		System.out.println(isSubstr2Places("quality", "lityqua"));
		System.out.println(isSubstr2Places("amazon", "onamaz"));
	}

}
