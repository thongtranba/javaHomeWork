package homeWorkDay8;

import java.util.Scanner;

public class romanNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your roman number: ");
		String romanNumber = input.nextLine();
		int number = convertRomanNumberToInteger(romanNumber);
		System.out.println("Integer Number: " + number);
		input.close();
	}

	public static int convertRomanNumberToInteger(String romanNumber) {
		int[] numbers = new int[romanNumber.length()]; // 1 step
		for (int i = 0; i < romanNumber.length(); i++) { // n steps
			numbers[i] = convertToInteger(romanNumber.charAt(i)); 
		}
		int intNumber = numbers[numbers.length - 1]; // 1 step

		for (int j = numbers.length - 2; j >= 0; j--) { // n steps
			if (numbers[j] >= numbers[j + 1]) {
				intNumber += numbers[j]; 
			} else {
				intNumber -= numbers[j];
			}
		}
		return intNumber; // 1step
	}

	public static int convertToInteger(char character) {
		int number = 0; //1 step
		switch (character) {
		case 'I':
			number = 1;
			break;
		case 'V':
			number = 5;
			break;
		case 'X':
			number = 10;
			break;
		case 'L':
			number = 50;
			break;
		case 'C':
			number = 100;
			break;
		case 'D':
			number = 500;
			break;
		case 'M':
			number = 1000;
			break;
		default:
			break;
		}
		return number;
	}

}
