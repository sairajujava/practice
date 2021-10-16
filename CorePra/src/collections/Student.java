package collections;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private String course;
	private double fee;
	private static String college_name = "JNTU";

	public Student() {

	}

	public Student(int id, String name, String course, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}

	@Override
	public int compareTo(Student st) {
		return (this.id - st.id);

		// old implementation

		/*
		 * if (this.id == st.id) return 0; else if (this.id > st.id) return 1; else
		 * return -1;
		 */
	}

}
