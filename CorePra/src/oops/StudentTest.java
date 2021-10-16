package oops;

public class StudentTest {

	public static void main(String[] args) {

		Student stu = new Student();
		
		stu.setId(100);
		stu.setName("Ashwin");
		stu.setCourse("Java");
		
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getCourse());

	}

}
