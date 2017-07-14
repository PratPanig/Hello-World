import java.util.HashSet;
import java.util.Iterator;

public class SumOfPair {
	public static void findpairs(int arr[], int sum){ 
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
               	 if(!(hs.contains(arr[i])) && !(hs.contains(sum-arr[i])))
               		 	hs.add(arr[i]);
           }
          }
         }
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext()){
			int value=itr.next();
			System.out.println(value+","+String.valueOf(sum-value));
		}
	}
	 public static void main(String []args){
	         int[] arr = {0,1,2,2,3,4,5};
	         int num = 4;
	         /*Set<Integer> hs=new HashSet<Integer>();
	         for(int i=0;i<arr.length;i++){        	 
	             for(int j=1;j<arr.length;j++){           	 
	                 if(arr[i]+arr[j]==num){
	                	 if(!hs.contains(arr[i]))
	                		 System.out.println(arr[i] +", " + arr[j]);
	                	 hs.add(arr[i]);
	                 }
	            }
	       }*/
	         findpairs(arr,4);
	  }
}
