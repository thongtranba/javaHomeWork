package homeWorkDay8;

public class Sort {
	public static void main(String[] args) {
		int[] array = { 0, 0, 2, 0, 1, 2, 0, 2 };
		int[] sortedArray = sort(array);
		for (int i : sortedArray) {
			System.out.println(i);
		}

	}

	public static int[] sort(int[] array) {
		int[] count = new int[2]; // 1step
		int[] sortedArray = new int[array.length]; // 1step
		
		for (int i = 0; i < array.length; i++) { //n step
			if (array[i] == 0) {
				count[0]++;
			} else if (array[i] == 1) {
				count[1]++;
			}

		}

		for (int j = 0; j < count[0]; j++) { //n step
			sortedArray[j] = 0;
		}
		for (int k = count[0]; k < count[0] + count[1]; k++) { //n step
			sortedArray[k] = 1;
		}
		for (int l = count[0] + count[1]; l < sortedArray.length; l++) { //n step
			sortedArray[l] = 2;
		}

		return sortedArray; //1 step
	}
									//time complexity -> O(n)
}
