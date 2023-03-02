package javademo.methodReference;

public class StringParser {
	public static String convertToUpperOrLower(String str) {
		if (str.length() > 3) {
			str = str.toUpperCase();
		} else
			str = str.toLowerCase();
		return str;
	}
	
	public static String reverseString(String str) {
		String rev = "";
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		
		return rev;
	}
}
