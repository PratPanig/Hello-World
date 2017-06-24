import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,3,4,6,7,5,3,2,1};
		Set<Integer> s = new HashSet<Integer>();
		int count=0;
		for (int i=0; i<arr.length;i++){
			if (s.contains(arr[i]))
			{
				System.out.print( arr[i] + ",");
				count = count +1;
			}
			s.add(arr[i]);
			
		}
		System.out.println();
		System.out.println("number of duplicate elements : "+count);
	}
	

}