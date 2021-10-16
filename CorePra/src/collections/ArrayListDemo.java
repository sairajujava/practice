package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<String>();
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("apple");
		al.add("apple");
		al.add("mango");
		al.add("grapes");
		al.add("guava");
		al.add(null);
		al.add("banana");
		al.add(null);
		
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
		
		System.out.println("========================");
		
		for(int i = 0; i<al.size() ; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("========================");
		
		for(String s : al) {
			System.out.println(s);
		}
		
		System.out.println("========================");
		
		 //1 
	       al.forEach(fruits -> System.out.println(" only forward direction ---" +fruits));
		

	}

}
