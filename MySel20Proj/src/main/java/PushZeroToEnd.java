
public class PushZeroToEnd {
	public static void pushToEnd(int[] number) {
        if (number == null || number.length == 0)
            return;
        int zeros = 0;
        int numIndex = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 0)
                zeros++;
            else
                number[numIndex++] = number[i];
        }
        for (int i = 0; i < zeros; i++)
            number[numIndex++] = 0;
        
        for (int i = 0; i < number.length; i++)
            System.out.println(number[i]);
    }
	public static void main(String[] args) {
		int[] arr={1,2,0,0,4,5,0,6,7,0,9};
		pushToEnd(arr);
	}

}
