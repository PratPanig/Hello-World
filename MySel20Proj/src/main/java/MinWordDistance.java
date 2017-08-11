import java.util.HashMap;

public class MinWordDistance {

	private void wordDist(String s, String s1, String s2) {
		int index1 = -1;
		int index2 = -1;
		boolean flag1 = false;
		boolean flag2 = false;
		int distance = Integer.MAX_VALUE;
		int answer = Integer.MAX_VALUE;
		String[] sarray = s.split(" ");
		for (int i = 0; i < sarray.length; i++) {
			if (!s1.equals(s2)) {
				flag1 = false;
				flag2 = false;
			}
			if (s1.equals(sarray[i]) && flag1 == false) {
				index1 = i;
				flag1 = true;
			} else if (s2.equals(sarray[i]) && flag2 == false) {
				index2 = i;
				flag2 = true;
			}
			if (index1 != -1 && index2 != -1) {
				distance = Math.abs(index1 - index2);
				flag1 = false;
				flag2 = false;
			}
			if (distance < answer) {
				answer = distance;
			}
		}
		if (answer == Integer.MAX_VALUE) {
			System.out.println("Words not found");
		} else {
			System.out.println(answer);
		}
	}

	/*
	 * private void wordDist(String s, String s1, String s2) {
	 * HashMap<String,Integer> hm1=new HashMap<String,Integer>(); String[]
	 * strArray=s.split(" "); for(int i=0;i<strArray.length;i++){
	 * hm.put(strArray[i],i); } if(!hm.containsKey(s1) || !hm.containsKey(s2))
	 * System.out.println("Word not found"); else
	 * System.out.println(Math.abs(hm.get(s1)-hm.get(s2))); }
	 */

	public static void main(String[] args) {
		MinWordDistance mwd = new MinWordDistance();

		mwd.wordDist("the brown qucik frog quick the", "the", "quick");
		mwd.wordDist("the quick the brown quick brown the frog", "the", "the");
		mwd.wordDist("the quick the brown quick brown the frog", "frog", "brown");
		mwd.wordDist("the quick the brown quick brown the frog", "brown", "brown");
		mwd.wordDist("the brown qucik frog quick the", "the", "quick");
		mwd.wordDist("the brown quick frog quick the a b frog frog brown", "the", "quick");
	}

}