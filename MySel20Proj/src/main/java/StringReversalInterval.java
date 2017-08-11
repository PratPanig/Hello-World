public class StringReversalInterval {
	public static void main(String[] args) {
		String input = "Run interactive";
		int interval = 6;

		int start = 0;
		String revInput = "";
		while ((start + interval) < input.length()) {
			revInput = reverseMe(input, start, start + interval, revInput);
			start = start + interval;
		}
		if (revInput.length() < input.length()) {
			revInput = reverseMe(input, start, input.length(), revInput);
		}
		System.out.println(revInput);
	}

	public static String reverseMe(String input, int start, int end, String addTo) {
		StringBuilder sb = new StringBuilder(input.substring(start, end));
		return (addTo + sb.reverse());
	}
}