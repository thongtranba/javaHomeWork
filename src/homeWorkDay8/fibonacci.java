package homeWorkDay8;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type number: ");
		int number = input.nextInt();
		int fibo = findFibonacci(number);
		System.out.println(fibo);
		input.close();
	}

	public static int findFibonacci(int number) { 					//time complexity -> O(n)
		int[] fibo = new int[number + 1]; // 1step
		int sum = 0; // 1step
		for (int i = 0; i < fibo.length; i++) { // nstep
			if (i == 0) {
				fibo[i] = 0;
			} else if (i == 1) {
				fibo[i] = 1;
			} else {
				fibo[i] = fibo[i - 1] + fibo[i - 2];
			}
			sum = fibo[i]; //1step
		}

		return sum; //1step
	}

}
