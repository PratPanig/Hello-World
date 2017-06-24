
public class FindElementWithoutLinearSearch {
	static void find(int arr[],int element)
	{
	        int difference=Math.abs(element-arr[0]);
	        int index=0;
	        while(index<arr.length)
	        {
	                while(difference-->0)
	                        index++;
	                if(index>=arr.length)
	                	break;
	                if(arr[index]==element)
	                {
	                        System.out.println("element found at "+index+" position");
	                        break;
	                }
	                else
	                        difference=Math.abs(arr[index]-element);

	        }
	        if(index>=arr.length)
	        	System.out.println("Element not found  ");
	}
	public static void main(String[] args){
		int arr[]={1,2,3,4,3,4,5,6,7};
		find(arr,4);
	}
}

