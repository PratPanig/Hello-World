public class OddStar { 
	public void printOddNumberPattern (int x){
	    
	    int d=(x+1)/2;
	    
	       if(x%2 != 0){
	           for(int i=1;i<=x;i++){
	               for(int j=1;j<=x;j++){
	            if((i<d && i>=j) || (i>d && i<=j) ) 
	                   System.out.print("*");
	               }
	               if(i == d){
	                for (int k=0;k<x;k++)  
	                 System.out.print("*");
	               }
	             System.out.print("\n");
	           }
	       }
	       
	   
	   }

	     public static void main(String []args){
	    	 OddStar sp= new OddStar();
	            sp.printOddNumberPattern(7);
	     }
}