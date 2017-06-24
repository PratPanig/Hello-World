import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
	public static void getDuplicate(int[] numbers) {
		Set<Integer> freq = new HashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (!freq.contains(numbers[i])) {
				freq.add(numbers[i]);
	        } else {
		        System.out.println("First Duplicate is "+numbers[i]);
		        return;
	       }
	}
	System.out.println("No Duplicate element is present");
	}
	public static void main(String[] args) {
		int []arr= {4,3,5,6,5,7,8,4};
		int []arr1= {4,3,5,6,9,7,8,4};
		getDuplicate(arr);
		getDuplicate(arr1);
	}

}
