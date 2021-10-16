package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(100, "Bhagya", "java", 10.0d));
		al.add(new Student(199, "Divya", "java", 10.0d));
		al.add(new Student(79, "Janaki", "java", 10.0d));
		al.add(new Student(101, "Giri", "java", 10.0d));
		al.add(new Student(89, "Ramesh", "java", 10.0d));
		
		System.out.println("==========Before Sorting=========");
		
		Iterator<Student> itr  = al.iterator();
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s);
		}
		
		System.out.println("=====After Sorting============");
		Collections.sort(al);
		
		Iterator<Student> itr1  = al.iterator();
		while(itr1.hasNext()) {
			Student s = itr1.next();
			System.out.println(s);
		}

	}

}
