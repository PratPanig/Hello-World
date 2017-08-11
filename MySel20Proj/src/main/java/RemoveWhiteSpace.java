public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
		while (str.indexOf(" ") != -1) {
			int x = str.indexOf(" ");
			str = str.substring(0, x) + str.substring(x + 1);
		}
		System.out.println(str);
	}
}
