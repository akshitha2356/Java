package cdc1;
import java.util.*;

public class Demo33 {
	public static void main(String[] args) {
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(56);
		l1.add(89);
		l1.add(90);
		System.out.println(l1);
		Enumeration i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}
		
		
	}

}