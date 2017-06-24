
public class FirstAndLast {
	static void printFirstAndLast(int[] arr,int num){
		int firstPos=-1,lastPos=-1;
		int pointer=0;
		while(pointer<arr.length){
			if(arr[pointer]==num && firstPos==-1)
				firstPos=pointer;
			if(firstPos!=-1 && arr[pointer]!=num){
				lastPos=pointer-1;
				break;
			}
			pointer++;
		}
		if(firstPos==-1)
			System.out.println("Number not found");
		else
			System.out.println("First Position="+firstPos+" Last position="+lastPos);
	}
	public static void main(String[] args) {
		int[] a={1,2,2,3,4,4,4,4,4,5,5,6,7,8};
		printFirstAndLast(a,4);
		printFirstAndLast(a,6);
		printFirstAndLast(a,9);
	}

}
