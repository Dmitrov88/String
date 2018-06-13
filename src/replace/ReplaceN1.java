package replace;

public class ReplaceN1 {

	public static String replace(String str, int k, String symbol) {
		if (str.length() < k ) {
			return str;
		} else if (str.length() == k) {
			return str.substring(0, k-1) + "*";
		}
		String beg = str.substring(0, k-1); 
		String end = str.substring(k, str.length());
		return beg  + "*" + end;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "אבגדהו"
				+ " טנננט טננטננ";
        int k = 5;
        String symbol = "*";
       
        String[] words = s.split(" ");
        String result = "";
        
        for (String w : words ) {
        	result += ReplaceN1.replace(w, k, symbol);
        	result += " ";
        }
        
        System.out.println(result);
        
        
                
      //  for(int i = 0; i < s.length(); i++) {
        	//char result = s.charAt(k);
        //	System.out.println(s.replace(result, symbol));
        	
       // }

	}

}

