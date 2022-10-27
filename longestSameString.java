package homeWorkDay8;

import java.util.Scanner;

public class longestSameString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("first string: ");
		String first = input.nextLine();
		System.out.print("second string: ");
		String second = input.nextLine();
		System.out.print("third string: ");
		String third = input.nextLine();
		String[] strings = new String[3];
		strings[0] = first;
		strings[1] = second;
		strings[2] = third;
		for (String string : strings) {
			System.out.println(string);
		}
		String sameString = longestSameStrings(first, second, third, strings);
		System.out.println("longest same String: " + sameString);
		input.close();
	}
	public static String longestSameStrings(String first, String second, String third, String[] strings) {
		int longestStringlength = shortStringLength(first, second, third); //1 step
		String SameString = "";	//1step
		for (int i = 0; i < longestStringlength; i++) { //n step
			if (strings[0].charAt(i) != strings[1].charAt(i) || strings[0].charAt(i) != strings[2].charAt(i)
					|| strings[1].charAt(i) != strings[2].charAt(i)) {
				return SameString;	//step
			} else {
				SameString += strings[i].charAt(i); //step
			}
		}
		return SameString;
	}
	public static int shortStringLength(String first, String second, String third) {
		int shortestLength = 0; //1step
		if (first.length() <= second.length() && first.length() <= third.length()) {
			shortestLength = first.length(); //1step
		}
		if (second.length() <= first.length() && second.length() <= third.length()) {
			shortestLength = second.length(); //1step
		}
		if (third.length() <= second.length() && third.length() <= first.length()) {
			shortestLength = third.length(); //1step
		}
		return shortestLength; //1step
	}
}
