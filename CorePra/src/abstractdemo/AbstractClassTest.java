package abstractdemo;

public class AbstractClassTest {

	public static void main(String[] args) {
		
		Animal a; // abstract class type ref variable
		
		a = new Cat();
		a.sound("cat");
		
		a = new Dog();
		a.sound("dog");
		a.display();
		Animal.show();

	}

}
