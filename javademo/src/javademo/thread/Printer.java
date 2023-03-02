package javademo.thread;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	List<Integer> list = new ArrayList<>();
	public void printDocument(String name, int copy) {
		for(int i=0; i<copy; i++) {
			list.add(i);
			System.out.println(list);
			System.out.println("Printing "+name+" "+i);
		}
	}
}
