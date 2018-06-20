package Traning;

import java.util.regex.Pattern;

public class MainApp {

	public static void main(String[] args) {
		/*
	}
		// TODO Auto-generated method stub
		String a = "Слава";
		String b = "Слабб";
		String c = "СЛАВА";
		String x = a.concat(b);
		System.out.println(a.concat(c));
		System.out.println(x.equals(a.concat(b)));
		System.out.println(x.equals("СлаваАня"));
		System.out.println(x.equals(a+b));
		System.out.println(x.compareTo(a+b));
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.substring(0,5));
		System.out.println(a.indexOf("Сла"));
		*/
		String s1 = "Java"; // литерал и ссылка на него
		String s2;
	
		//s2 = s1.intern()+"f";
		//System.out.println(s2); // true
		
		
		
		String str = "Name Masha masha name name java Java hello and Name And is is is Is MASHA";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 1;
			if (arr[i] != " ") {
				for (int j = i; j < arr.length - 1; j++) {
					if (arr[i].equalsIgnoreCase(arr[j + 1])) {
						count++;
						arr[j + 1] = " ";
					}
				}
				System.out.println(arr[i] + " = " + count);
				arr[i] = " ";
			}
		}
	}

}
