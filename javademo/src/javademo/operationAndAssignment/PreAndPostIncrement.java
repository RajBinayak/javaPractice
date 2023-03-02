package javademo.operationAndAssignment;

import java.util.Iterator;

public class PreAndPostIncrement {
	public static void main(String[] args) {
		int x=0;
		int y=0;
		for (int i = 0; i < 5; i++) {
			System.out.println("x = "+x+" y = "+y+" i = "+i);
			System.out.println();
			if((++x>2) && (++y >2))
				x++;
			System.out.println("x = "+x+" y = "+y+" i = "+i);
		}
		System.out.println(x+" "+y);
	}

}
