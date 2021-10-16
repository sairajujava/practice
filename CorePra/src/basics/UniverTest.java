package basics;

public class UniverTest {

	public static void main(String[] args) {
		
		University uni = new University();
		
		uni.setId(100);
		uni.setName("SVU");
		uni.setLocation("Tirupathi");
		
		System.out.println("University ID:"+uni.getId());
		System.out.println("University NAME:"+uni.getName());
		System.out.println("University LCATION:"+uni.getLocation());
		

	}

}
