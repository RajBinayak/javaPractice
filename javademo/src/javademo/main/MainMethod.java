package javademo.main;

import javademo.methodReference.MyPrinter;
import javademo.methodReference.Parser;
import javademo.methodReference.StringParser;
import javademo.thread.Printer;
import javademo.thread.Thread1;
import javademo.thread.Thread2;
import javademo.thread.Thread3;
import javademo.thread.User1;
import javademo.thread.User2;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println("====Process Start====");

//		Thread t1 = new Thread(new Thread1());
//		Thread t2 = new Thread(new Thread2());
//		Thread t3 = new Thread(new Thread3());
//		
//		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		t2.start();
//		t3.start();

//		Printer printer = new Printer();
//		User1 u1 = new User1(printer);
//		User2 u2 = new User2(printer);
//		u1.start();
//		u2.start();

//		===========================================

		String str = "Binayak";
		MyPrinter mp = new MyPrinter();

//		anonymous inner class
		mp.print(str, new Parser() {

			@Override
			public String parse(String str) {

				return StringParser.convertToUpperOrLower(str);
			}

		});

		mp.print(str, new Parser() {
			public String parse(String str) {
				return StringParser.reverseString(str);
			}
		});

//		converting to lambda expression
		mp.print(str, s -> StringParser.convertToUpperOrLower(s));
		mp.print(str, s -> StringParser.reverseString(s));

//		converting to method reference
		mp.print(str, StringParser::convertToUpperOrLower);
		mp.print(str, StringParser::reverseString);

//		============================================

		System.out.println("====Process End====");

	}

}
