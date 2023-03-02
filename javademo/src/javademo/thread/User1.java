package javademo.thread;

public class User1 extends Thread{
	
	Printer printer;
	public User1(Printer p){
		printer = p;
	}
	
	public void run() {
		printer.printDocument("user 1", 10);
	}

}
