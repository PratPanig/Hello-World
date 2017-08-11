import java.util.LinkedHashMap;

public class test {

	/*
	 * public static void main(String[] args){
	 * removeNumbers("Prateek141Panigrahy"); } public static void
	 * removeNumbers(String s){ int i=0; StringBuffer s1=new StringBuffer();
	 * while(i<s.length()){ try{ Integer.parseInt(""+ s.charAt(i)); }
	 * catch(Exception e){ s1.append(s.charAt(i)); }
	 * if(!(Character.isDigit(s.charAt(i)))) s1.append(s.charAt(i)); i++;}
	 * System.out.println(s1.toString());
	 * 
	 * } }
	 */

	/*
	 * import java.util.*; class Book implements Comparable<Book>{ int id;
	 * String name,author,publisher; int quantity; public Book(int id, String
	 * name, String author, String publisher, int quantity) { this.id = id;
	 * this.name = name; this.author = author; this.publisher = publisher;
	 * this.quantity = quantity; } public int compareTo(Book b) { if(id>b.id){
	 * return 1; }else if(id<b.id){ return -1; }else{ return 0; } } } public
	 * class test { public static void main(String[] args) { Queue<Book>
	 * queue=new PriorityQueue<Book>(); //Creating Books Book b1=new
	 * Book(121,"Let us C","Yashwant Kanetkar","BPB",8); Book b2=new
	 * Book(233,"Operating System","Galvin","Wiley",6); Book b3=new
	 * Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	 * //Adding Books to the queue queue.add(b1); queue.add(b2); queue.add(b3);
	 * System.out.println("Traversing the queue elements:"); //Traversing queue
	 * elements for(Book b:queue){
	 * System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.
	 * quantity); } queue.remove();
	 * System.out.println("After removing one book record:"); for(Book b:queue){
	 * System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.
	 * quantity); } }
	 */

	static void longestSubstring(String inputString) {
		// Convert inputString to charArray

		char[] charArray = inputString.toCharArray();

		// Initialization

		String longestSubstring = null;

		int longestSubstringLength = 0;

		// Creating LinkedHashMap with characters as keys and their position as
		// values.

		LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();

		// Iterating through charArray

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];

			// If ch is not present in charPosMap, adding ch into charPosMap
			// along with its position

			if (!charPosMap.containsKey(ch)) {
				charPosMap.put(ch, i);
			}

			// If ch is already present in charPosMap, reposioning the cursor i
			// to the position of ch and clearing the charPosMap

			else {
				i = charPosMap.get(ch);

				charPosMap.clear();
			}

			// Updating longestSubstring and longestSubstringLength

			if (charPosMap.size() > longestSubstringLength) {
				longestSubstringLength = charPosMap.size();

				longestSubstring = charPosMap.keySet().toString();
			}
		}

		System.out.println("Input String : " + inputString);

		System.out.println("The longest substring : " + longestSubstring);

		System.out.println("The longest Substring Length : " + longestSubstringLength);
	}

	public static void main(String[] args) {
		longestSubstring("javaconceptoftheday");

		System.out.println("==========================");

		longestSubstring("thelongestsubstring");
	}
}