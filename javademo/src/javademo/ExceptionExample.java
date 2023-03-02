package javademo;

public class ExceptionExample {
	public static void main(String[] args) throws ArithmeticException {
		int x = 0;
		int y = 10;
		try {
			int c = y/x;
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
