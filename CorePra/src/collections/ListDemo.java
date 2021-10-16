package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> li;
		
		li = new ArrayList<String>();
		
		// add the elements
		
		li.add("apple"); //0
		li.add("orange"); // 1
		li.add(null);
		li.add("apple");
		li.add("mango");
		li.add("grapes");
		System.out.println("SIZE:"+li.size());
		li.add(1, "grapes");
		System.out.println("SIZE:"+li.size());
		
		// remove
		
		li.remove(4);
		
		System.out.println("List:"+li);
		
		// iterate
		
		Iterator<String> itr = li.iterator();
		while(itr.hasNext()) {
			String val = itr.next();
			System.out.println(val);
		}
		
		// get()
		
		String val = li.get(5);
		System.out.println("get :"+val);
		
		Object[] strArr = li.toArray();
		for(Object s : strArr) {
			System.out.println(s);
		}
		

	}

}
