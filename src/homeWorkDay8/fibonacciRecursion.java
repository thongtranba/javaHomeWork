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
		int[] fibo = new int[number+1]; //1 step
		if (number == 0) {	//1step
			return fibo[0]= 0;

		} else if (number == 1) { //1step
			return  fibo[1] = 1;

		} else  {
			fibo[number] = findFibonacci(number-1)+ findFibonacci(number-2); //n steps
			
			return fibo[number]; //1step
		}

		
	}

}
