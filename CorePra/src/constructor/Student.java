package constructor;

public class Student {
	
	public int id;
	public String name;
	public long mobile;
	
	public Student() {
		System.out.println(" i am in default constructor...");
	}
	
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student(int id, long mobile) {
		this.id = id;
		this.mobile = mobile;
	}
	
	public Student(long mobile, int id) {
		this.mobile = mobile;
		this.id = id;
	}
	public void display() {
		System.out.println(id + " : " + name);
	}

	public static void main(String[] args) {
		
		Student stu = new Student(104,"Janaki");
		stu.display();
		
		

	}

}
