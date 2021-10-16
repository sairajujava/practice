package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonwrieArrayListDemo {

	public static void main(String[] args) {
		
		 CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
		
		al.add("apple");
		al.add("apple");
		al.add("mango");
		al.add("grapes");
		al.add("guava");
		al.add("banana");
		
		System.out.println("SIZE:"+al.size());
		
		// iterate()
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			String val = itr.next();
			if(val.equals("apple")) {
				al.remove("apple");
			}
			System.out.println(val);
		}
		

	}

}
