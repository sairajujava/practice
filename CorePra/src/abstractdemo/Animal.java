package abstractdemo;

public abstract class Animal {
	
public abstract void sound(String animalName);


public static void show() {
	System.out.println("i am in Animal class...");
}

// constructor

public Animal() {
	System.out.println(" I am in Animal class constructor..");
}

int a =100;
int b = 200;
public void display() {
	System.out.println("i am in Animal class..." + (a+b));
}


}
