public class ReverseString{

     public static void main(String []args){
         String str = "this is me";
         char[] arr = str.toCharArray();
         int len = arr.length;
         for(int i=0;i<arr.length/2;i++){
             char temp = 0;
             temp = arr[i];
             arr[i] = arr[len-i-1];
             arr[len-i-1] = temp;
         }
         for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]);
     }
}