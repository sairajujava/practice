package controlstatments;

import java.util.Scanner;

public class PrimeNumberDemo {

	private static void checkPrime() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enteryour No:");
		int num = sc.nextInt();

		boolean isPrime = false;

		if (num < 2) {
			isPrime = false;
		} else {
			isPrime = true;
		}

		for (int i = 2; i < num / 2; i++) {
			if ((num % i) == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("The enter number is prime");
		} else {
			System.out.println("The enter number not prime");
		}

	}

	public static void main(String[] args) {

		checkPrime();

	}

}
