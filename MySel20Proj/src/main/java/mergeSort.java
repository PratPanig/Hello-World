public class mergeSort {
	 void mergesort(int[] array) {
		 int[] helper = new int[array.length];
		 mergesort(array, helper, 0, array.length - 1);
		 }
		
		void mergesort(int[] array, int[] helper, int low, int high) {
		if (low< high) {
		int middle = (low + high)/ 2;
		mergesort(array, helper, low, middle); // Sort left half
		mergesort(array, helper, middle+1, high); // Sort right half
		merge(array, helper, low, middle, high); // Merge them
		}}
		
		 void merge(int[] array, int[] helper, int low, int middle, int high) {
		 /* Copy both halves into a helper array*/
		 for (int i= low; i <= high; i++) {
		 helper[i] = array[i];
		 }
		 int helperleft = low;
		 int helperRight =middle + 1;
		 int current = low;
		
		 /* Iterate through helper array. Compare the left and right half, copying back
		 * the smaller element from the two halves into the original array. */
		 while (helperleft <= middle && helperRight <= high) {
		 if (helper[helperleft] <= helper[helperRight]) {
		 array[current] = helper[helperleft];
		 helperleft++;
		 } else {//If right element is smaller than left element
		 array[current] = helper[helperRight];
		 helperRight++;
		 }
		 current++;
		 }
		
		 /* Copy the rest of the left side of the array into the target array*/
		 int remaining= middle - helperleft;
		 for (int i= 0; i <= remaining; i++) {
		 array[current + i] = helper[helperleft + i];
		 }
		 
		 for(int x=0;x<array.length;x++)
			 System.out.println(array[x]);
		}
	
public static void main(String[] args){
	int[] oArr={38,27,43,3,9,82,10};
	new mergeSort().mergesort(oArr);
}
}
