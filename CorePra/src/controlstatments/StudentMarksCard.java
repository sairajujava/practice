package controlstatments;

import java.util.Scanner;

public class StudentMarksCard {

	public static void main(String[] args) {

		// if you want read the data dynamically

		String grade = "";
		int testAvgMarks = 76;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Name:");

		String name = sc.nextLine();
		System.out.println("Enter Student MAths Marks:");
		int m = sc.nextInt();
		System.out.println("Enter Student Science Marks:");
		int s = sc.nextInt();
		System.out.println("Enter Student Computers Marks:");
		int c = sc.nextInt();

		System.out.println("=============Student Subjectvice Marks======================");

		System.out.println("Maths MArks:" + m);
		System.out.println("Science MArks:" + s);
		System.out.println("ComputerScience MArks:" + c);

		System.out.println("=============Student Status=====================");

		if (m >= 35 && s >= 35 && c >= 35) {

			System.out.println("Candidate Status is PASS");
		} else {
			System.out.println("Candidate Status FAIL");
		}

		System.out.println("=============Student Total MArks=====================");
		System.out.println("Student Total:" +(m + s + c) );

		System.out.println("=============Student Average MArks=====================");
		int avgMarks = (m + s + c) / 3;
		
		System.out.println("Student Avg:" + avgMarks);

		System.out.println("=============Student Grade====================");
		      
		if((avgMarks >= 90) && (avgMarks <= 76)) {
			grade = "A";
		}else if((avgMarks >= 75) && (avgMarks <= 65)){
			grade = "B";
		}else if((avgMarks >= 64) && (avgMarks <= 60)) {
			grade = "C";
		}else if((avgMarks >= 59) && (avgMarks <= 55)) {
			grade = "D";
		}else if((avgMarks >= 54) && (avgMarks <=36)){
			grade = "E";
		}else {
			grade = "F";
		}
		
		System.out.println("Student grade :"+grade);
	}

}
