package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		
		al.add("apple");
		al.add("apple");
		al.add("mango");
		al.add("grapes");
		al.add("guava");
		al.add(null);
		al.add("banana");
		al.add(null);
		
		System.out.println("SIZE:"+al.size());
		
		// add the element as a first for list of objects
		
		al.addFirst("firstFruit");
		
		// add the element as a last for list of objects
		al.addLast("lastfruit");
		
		// iterate()
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			String val = itr.next();
			System.out.println(val);
		}
		

	}

}
