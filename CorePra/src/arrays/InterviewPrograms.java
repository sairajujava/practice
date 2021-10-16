package arrays;

public class InterviewPrograms {

	private static void countAllFromAnArray() {

		int[] intArr = { 1, 20, 30, 44, 67, 88 };

		int total = 0;

		// using length

		for (int i = 0; i < intArr.length; i++) {

			total = total + intArr[i];

		}
		
		System.out.println("total of An Array data elements:"+total);

	}

	private static void countOfWords(String str) {
		
		String[] words = str.split(" ");
		
		int count = 0;
		
		for(String w : words) {
			
			System.out.println(w);
			
			count++;
		}
		
		System.out.println("Total Words Count:"+count);
	}
	public static void main(String[] args) {

		countAllFromAnArray();
		
		countOfWords("Welcome to my party");

	}


}
