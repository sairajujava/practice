package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map;

		map = new HashMap<Integer, String>();
		
		// add the records using put()
		
		
		System.out.println("SIZE:" + map.size());
		
		map.put(1, "violet");
		map.put(2, "indigo");
		map.put(3, "blue");
		map.put(4, "green");
		map.put(5, "yellow");
		map.put(6, "orange");
		map.put(7, "red");
		map.put(null, null);
		map.put(null, null);
		
		// iterate using keySet() ===> Type2
		
		Iterator<Integer> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			Integer key = itr.next();
			String val = map.get(key);
			System.out.println(key + " : " + val);
		}
		
		System.out.println("===============================");
		
		// iterate using entrySet() ===> Type2
		
		Iterator<Entry<Integer,String>> itr1 = map.entrySet().iterator();
		
		while(itr1.hasNext()) {
			Entry<Integer,String> entry = itr1.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("===============================");
		// Types - 3 using foreach loop
		
		for(Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
		
		
		System.out.println("===============================");
		// getValues() ===> Type4 sepearately print both keys and values
		
		Set<Integer> keys = map.keySet();
		Collection<String> values = map.values();
		
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		for(String s : values) {
			System.out.println(s);
		}
		
		System.out.println("============jdk8===================");
		// jdk 8 feature using forEach()
		
		map.forEach((k,v) -> {
			
			System.out.println(k + " : " + v);
		});

	}

}
