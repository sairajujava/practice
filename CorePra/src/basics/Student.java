package basics;

public class Student implements Cloneable{

	int id;
	String name;

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {

		// Type - 1 using new

		Student stu = new Student();

		System.out.println("Student ID:" + stu.id);

		System.out.println("Student ID:" + stu.name);
		
		stu.id = 100;
		stu.name = "Bhagya";
		
		System.out.println("Student ID:" + stu.id);

		System.out.println("Student ID:" + stu.name);
		
		
		Student stu1 = new Student();
		
		
		stu1.id = 101;
		stu1.name = "Divya";
		
		System.out.println("Student ID:" + stu1.id);

		System.out.println("Student ID:" + stu1.name);
		
		
		// Type - 2 newInstance()
		
		
		System.out.println("====================================");
		
		Student s = Student.class.newInstance();
		
		s.id = 103;
		s.name = "janaki";
		

		System.out.println("Student ID:" + stu1.id);

		System.out.println("Student ID:" + stu1.name);
		
		
		// Type - 3 newInstance()
		
		
		System.out.println("====================================");
				
		Student obj = (Student) stu.clone();
		
		System.out.println("Clone Object Student ID:" + obj.id);

		System.out.println("Clone Object Student Name:" + obj.name);
		

	}

}
