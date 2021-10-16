package constructor;

public class Employee {

	public int id; // 0
	public String name; // null

	Employee() {
		this(1); // this() used to write as first statement becuase constructor obnormally return this keyword.
		System.out.println(" I am in constructor of Employee class...");
		id = 100;
		name = "Ramesh";
	}
	Employee(int id){
		
	}

	public void display() {
		System.out.println(id + " : " + name);
		this.id = 100;
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.id = 101;
		emp.name = "Swati";
		emp.display();

	}

}
