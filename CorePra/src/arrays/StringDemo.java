package arrays;

public class StringDemo {

	public static void main(String[] args) {

		// String literals

		String s = "java";
		String s1 = "java";
		String s2 = "Java";
		String s3 = new String("java");

		System.out.println("s hashcode :" + s.hashCode());
		System.out.println("s1 hashcode :" + s1.hashCode());
		System.out.println("s2 hashcode :" + s2.hashCode());
		System.out.println("s3 hashcode :" + s3.hashCode());

		// == and equlas()

		// 1 . == operator will be checking the comparsion b/w both strings operand
		// values but both should be string literals
		// 2 . Both string literals should be mapped same contenet in the stringconstant
		// pool so that it would have same hascode()
		// 3 . Both string must be have the same content

		System.out.println(s == s1); // T

		System.out.println(s == s3); // F T

		System.out.println(s2 == s3);// F

		System.out.println(s1 == s3);// T F
		System.out.println("============================");

		// equals() ===> will be return true if both strings [ either string literal nor
		// new operator string ] consisting of same content

		System.out.println(s.equals(s1)); // T
		System.out.println(s1.equals(s3));// T
		System.out.println(s3.equals(s2));// F
		System.out.println(s2.equals(s1));// F
		System.out.println(s1.equals(s2));// F

		System.out.println("============================");
		// equlasIgnoreCase() ===> will be return true if both strings [ either string
		// literal nor new operator string ] consisting of same content even though it
		// has case sensitive

		System.out.println(s1.equalsIgnoreCase(s2));// T

	}

}
