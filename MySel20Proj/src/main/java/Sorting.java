public class Test {
public static void insertionSort(int[] num){
	int j; // no. of sorted elements
	int key; // the item to be inserted
	int i;
	for(j=1;j<num.length;j++){
		key=num[j];
			for(i=j-1;i>=0 && num[i]<key;i-- )
				num[i+1]=num[i];
			num[i+1]=key;
	}
	
	for(int x=0;x<num.length;x++)
		System.out.println("Insertion Sort: "+num[x]);
}

public static void bubbleSort(int[] num){
	boolean flag=true;
	int i,temp;
		while(flag){
			flag=false;
			for(i=0;i<num.length-1;i++)
			{
				if(num[i]<num[i+1]){
					temp=num[i];
					num[i]=num[i+1];
					num[i+1]=temp;
					flag=true;
				}
			}
		}
		for(int x=0;x<num.length;x++)
			System.out.println("Bubble Sort: "+num[x]);
}
	
public static void selectionSort(int[] num){
	int i,j,first,temp;
	for(i=num.length-1;i>0;i--)
	{
		first=0;
			for(j=1;j<=i;j++)
			{
				if(num[j]<num[first])
					first=j;
			}
			temp=num[first];
			num[first]=num[i];
			num[i]=temp;
	}
	for(int x=0;x<num.length;x++)
		System.out.println("Selection Sort: "+num[x]);
}

public static void binarySearch(int[] num, int start, int end,int key){
	int pos=(start+end)/2;
	while(num[pos]!=key && start<=end){
		if(num[pos]>key)
			end=pos-1;
		else
			start=pos+1;
		pos=(start+end)/2;
	}
	System.out.println(key+" is found in "+pos+ " number");
}

public static void main(String args[]) {
int[] arr={67,69,76,84,89,91,94};
//insertionSort(arr);
//bubbleSort(arr);
//selectionSort(arr);
//binarySearch(arr,0,arr.length,84);
}}