package javademo.thread;

public class User2 extends Thread{
	
	Printer printer;
	public User2(Printer p){
		printer = p;
	}
	
	public void run() {
		printer.printDocument("user 2", 10);
	}

}
