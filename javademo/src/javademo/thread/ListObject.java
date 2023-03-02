package javademo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListObject implements ListInterface{
//	static List<Integer> list = new ArrayList<>();
	synchronized public void  addElement(int i) {
//		list.add(i);
		System.out.println("List value :"+i);
	}

}
