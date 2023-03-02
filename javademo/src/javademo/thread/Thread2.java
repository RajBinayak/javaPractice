package javademo.thread;

public class Thread2 extends ListObject implements Runnable{
	
	public void run() {
		for(int i =10; i<20;i++) {
			System.out.println("printer 2 printing the doc :"+i);
			addElement(i);
		}
	}

}
