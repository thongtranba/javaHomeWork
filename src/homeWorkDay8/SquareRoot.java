package homeWorkDay8;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Type your number:");
		double number = input.nextInt();

		double result = squareRootFunc(number);
		System.out.println("Square Root is: " + result);

		input.close();
	}

	static double squareRootFunc(double number) {
		double squareRoot = 0;
		if (number <= 0) {	//1 step
			System.out.println("wrong number!!! The number must be greater than 0.");
		} else {
			double i = 1; //1 step
			boolean flag = false;	//1 step
			while (!flag) {
				if (i * i == number) {
					squareRoot = i;	//1 step
					flag = true;	//1 step
				} else if (i * i > number) {
					squareRoot = Calculating(number, i - 1, i); //1 step
					flag = true; //1 step
				}
				i++; //1 step
			}
		}

		return squareRoot; //1 step
	}

	static double Calculating(double number, double x, double y) {
		double avgNumber = (x + y) / 2; //1 step
		double square = avgNumber * avgNumber; //1 step
		if (square - number < 0.0001) {
			return avgNumber; //1 step
		} else if (square > number) {
			return Calculating(number, x, avgNumber); //n steps

		} else {
			return Calculating(number, avgNumber, y); //n steps

		}

	}
}
