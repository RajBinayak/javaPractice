package javademo.recursion;

public class FindOccurance {
	public static int first = -1;
	public static int last = -1;

	public static void findRecursion(String str, int index, char elm) {
		if (index < str.length()) {
			if (str.charAt(index) == elm) {

				if (first == -1) {
					first = index;
				} else
					last = index;

				System.out.println("First Occurance at :" + first + " Last Occurance at :" + last);

			}
			index++;
			findRecursion(str, index, elm);
		}
	}

	public static void main(String[] args) {
		String str = "abaacdaefaah";
		char elm = 'a';
		findRecursion(str, 0, elm);
	}

}
