import java.util.Scanner;

public class Print0sAnd1s {

		static String s =""; 

		public static void main(String args[]) 
		{ 
		Scanner in = new Scanner(System.in); 
		while (in.hasNext()) 
		{ 
		String str = in.nextLine(); 
		if(str.equals("1") || str.equals("0")) 
		{ 
		String s1 = testmethod(str); 
		System.out.println("s= "+s1); 
		} 
		else 
		return; // break; can also be used here. 

		} 
		} 

		public static String testmethod(String args) 
		{ 

		if(args.equals("0")) 
		{ 
		s = args+s; 

		} 
		else if(args.equals("1")) 
		{ 
		s = s+args; 
		} 

		return s; 
		}
}
