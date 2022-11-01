package homeWorkDay8;

import java.util.Scanner;

public class fibonacciRecursion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type number: ");
		int number = input.nextInt();
		int fibo = findFibonacci(number);

		System.out.println(fibo);
		input.close();

	}

	public static int findFibonacci(int number) { // time complexity -> O(n)

		if (number == 0) { // 1step
			return 0;

		} else if (number == 1) { // 1step
			return 1;

		} else {

			return findFibonacci(number - 1) + findFibonacci(number - 2); // n steps;
		}

	}

}
