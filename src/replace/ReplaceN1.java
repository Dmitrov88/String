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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "    �������� ���� ����� ��������� �";
		s=s.trim();
        int k = 5;
        String symbol = "*";
       
        String[] words = s.split(" ");
        String result = "";
        
     // ��� ������������� ������-�������
        for (String w : words ) {
        	result = result+ReplaceN1.replace(w, k, symbol);
        	result += " ";
        }
        result=result.trim();
        System.out.println(result);
        
        
     // � �������������� �������������     
        StringBuilder result1 = new StringBuilder();
        for (String w : words ) {
          result1.append(ReplaceN1.replace(w, k, symbol)).append(" ");
        }
        
        System.out.println(result1.toString()); 
      
        
   }
}
        
        
      