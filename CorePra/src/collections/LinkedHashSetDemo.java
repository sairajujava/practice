package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<String> al = new  LinkedHashSet<String>();
		
		//Set<String> al = new CopyOnWriteArraySet<String>();

		al.add("apple");
		al.add("apple");
		al.add("mango");
		al.add("grapes");
		al.add("guava");
		al.add(null);
		al.add("banana");
		al.add(null);

		System.out.println("SIZE:" + al.size());

		// iterate()

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			String val = itr.next();
			/*
			 * if(val.equals("apple") || val != null) { al.remove("apple"); }
			 */
			System.out.println(val);
		}

		System.out.println("========================");

		for (String s : al) {
			System.out.println(s);
		}

		System.out.println("========================");

		// 1
		al.forEach(fruits -> System.out.println(" only forward direction ---" + fruits));

	}

}
