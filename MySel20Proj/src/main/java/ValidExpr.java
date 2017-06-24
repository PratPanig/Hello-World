public class ValidExpr {
    public static void main(String[] args) {
        String expr = "((()))";
        System.out.println(isValid(expr));
    }
    
    public static boolean isValid(String str) {
    	int i=0, n=0;
    	while (i < str.length()) {
    		if (str.charAt(i) == '(') {
    			n++;
    		} else if (str.charAt(i) == ')') {
    			if (n == 0) return false;
    			n--;
    		}
    		i++;
    	}

    	return (n == 0);
    }
}