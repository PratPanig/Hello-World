
public class PrintReverse {

	public static void main(String[] args) {
		String test= "This is test";
		String [] reverseTest= test.split(" ");
		for (int i= reverseTest.length-1; i>=0;i--){
			System.out.print(reverseTest[i]);
			if(i>0)
				System.out.print(" ");
			}

	}
}
