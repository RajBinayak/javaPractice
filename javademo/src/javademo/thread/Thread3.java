package javademo.thread;

public class Thread3 extends ListObject implements Runnable{
	
	public void run() {
		for(int i =20; i<30;i++) {
			System.out.println("printer 2 printing the doc :"+i);
			addElement(i);
		}
	}

}
