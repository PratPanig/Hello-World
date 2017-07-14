
public class mergeTwoArrays {
	public static void merge(int[] a, int[] b) {
		int j=b.length-1;
		int i=a.length-b.length-1;
		int k = a.length-1; // Index of last location of array a
		
		 // Start comparing from the last element and merge a and b
		 while (i >= 0 && j >= 0) {
		 if (a[i] > b[j]) {
		 a[k--] = a[i--];
		 } else {
		 a[k--] = b[j--];
		 }
		 }
		 
		 if(i>=0){
			while(i>=0){
					a[k--] = a[i--];
				}
			}

		if(j>=0){
			while(j>=0){
					a[k--] = b[j--];
				}
			}
		 }
	
	public static void main(String[] args){
		int[] a= new int[9];
		a[0]=1;a[1]=3;a[2]=5;a[3]=7;a[4]=9;
		int[] b={2,4,6,8};
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		for(int i:b)
			System.out.print(i+" ");
		System.out.println();
		merge(a,b);
		for(int y:a)
			System.out.print(y+" ");
	}
}
