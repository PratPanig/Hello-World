
public class PrintReverse {

	static String rev(String s){
		char[] ab=s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<=j){
			char c=ab[i];
			ab[i]=ab[j];
			ab[j]=c;
			i++;
			j--;
		}		
		return String.valueOf(ab);
		
	}
	
	public static void main(String[] args) {
		String test= "This is test";
		String [] reverseTest= test.split(" ");
		StringBuilder revString=new StringBuilder();
		for (int i= reverseTest.length-1; i>=0;i--){
			System.out.print(reverseTest[i]);
			if(i>0)
				System.out.print(" ");
			}
		for (int i= 0; i<reverseTest.length;i++){
			revString.append(rev(reverseTest[i]));
			revString.append(" ");
			/*if(i<reverseTest.length-1)
				revString.append(" ");
			*/}
		System.out.println();
		System.out.println(revString);
	}
}
