import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedCount {
	static void duplicates(int arr1[]) {
        Map<Integer,Integer> lm=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<arr1.length;i++){
        	if(lm.containsKey(arr1[i]))
        		lm.put(arr1[i], lm.get(arr1[i])+1);
        	else
        		lm.put(arr1[i], 1);
        }
        for(Map.Entry<Integer,Integer> me:lm.entrySet()){
        	if (me.getValue() > 1) {
        		System.out.println(me.getKey() + "  is  " + me.getValue());
        	}
        }
  }
	public static void main(String[] args) {
		int intArray[] = { 1, 2, 3, 3, 4, 5, 5, 5, 6 ,7,7};
		duplicates(intArray	);
	}

}
