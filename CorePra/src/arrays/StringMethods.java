package arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "JavaCampus";
		
		
		// charAt() ---> IT would be return character which is mapped with corrrsponding index
		
		char c = s.charAt(3); // a
		System.out.println("char :"+c);
		
		// lenght() ----> IT would be return count if the characters from string
		
		int len = s.length();
		System.out.println("Length :"+len);
		
		String str = s.format("Welcome to %s", s);
		System.out.println("format :"+str);
		
		// substring() ---> which is return substring based on the index value.
		
		System.out.println("SubString :"+s.substring(4));
		
		System.out.println("substring with start and end :"+s.substring(4, 6));
		
		// isEmpty() ---> Checks string is empty or not
		
		System.out.println("isEmpty :"+s.isEmpty());
		
		String s1 = "Welcome to my party";
		
		String[] words = s1.split(" ");
		
		for(String st : words) {
			System.out.println(st);
		}
		
		System.out.println("====================");
		
		int index = s.indexOf('a');
		System.out.println("index :"+index);
		
		

	}

}
