
public class replaceCharFromString {

	public static void main(String[] args) {
		 String s1 = "abcdcdef";
		 String s2="xyz";
		 char check='c';
		 char[] c1=s1.toCharArray();
		 char[] c2=s2.toCharArray();
		 int checklen=0;
		 for(char c:c1){
			 if(c==check)
				 checklen++;
		 }
		 char[] c3=new char[(checklen*c2.length)+c1.length-checklen];
		 int newLen=c3.length-1;
		 for(int i=c1.length-1;i>=0;i--){
			 if(c1[i]==check){
				 for(int x=c2.length-1;x>=0;x--)
					 c3[newLen--]=c2[x];
			 }
			 else
				 c3[newLen--]=c1[i];
		 }
		 System.out.println(String.valueOf(c3));
	}
}
