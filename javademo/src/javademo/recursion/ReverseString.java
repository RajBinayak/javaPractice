package javademo.recursion;

public class ReverseString {
	public static void printReverse(String str, int index) {
		if (index >= 0) {
			System.out.print(str.charAt(index));
			index--;
			printReverse(str, index);
		}
	}

	public static void main(String[] args) {
		String str = "abcd";
		printReverse(str, str.length() - 1);

	}

}
