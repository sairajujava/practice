package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Collection col = null;
		
		
		
		col = new ArrayList<>();
		
		// add some objects
		
		col.add("Apple");
		col.add("Orange");
		col.add("Banana");
		col.add(12);
		
		System.out.println(col);
		System.out.println("============================");
		
		
		// iterator()
		
		Iterator itr = col.iterator();
		
		while(itr.hasNext()) {
			
			Object ob = itr.next();
			
			System.out.println(ob);
			
		}
		
		System.out.println("isEmpty :"+col.isEmpty());
		
		boolean status = col.contains(120);
		System.out.println("Contains :"+status);
		
		//col.clear();
		
		//System.out.println(col);
		//System.out.println("isEmpty :"+col.isEmpty()); // true
		
		// remove
		
		System.out.println("Before remove size :" + col.size());
		System.out.println("remove :"+col.remove(12));
		System.out.println(col);
		System.out.println("After remove size :" + col.size());
		
		// How to convert collection to an array
		
		Object[] objArr = col.toArray();
		
		for(Object obj : objArr) {
			System.out.println(obj);
		}

	}

}
