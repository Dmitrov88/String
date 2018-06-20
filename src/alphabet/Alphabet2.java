package alphabet;

public class Alphabet2 {

	public static void main(String[] args) {
		char[] alp = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String str = "Slava";

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + "\t");
		}
		System.out.println();
		for (int i = 0; i < str.length(); i++) {
			char charByIndex = str.toLowerCase().charAt(i);
			for (int j = 0; j < alp.length; j++) {
				if (alp[j] == charByIndex) {
					System.out.print(j + 1 + "\t");
				}
			}
		}
	}
}