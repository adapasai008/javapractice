package conditionalsLoopsAndFunctions;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] array = { 29, 34, 12, 45, 56, 02, 43, 19 };

		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
