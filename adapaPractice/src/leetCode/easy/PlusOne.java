package leetCode.easy;

public class PlusOne {

	public static void main(String[] args) {
		// should add the +1 to last element of the given array;

		int[] num = {1,2,3,8};
		int j = num.length - 1;

		for (int i = 0; i < num.length; i++) {
			if (i == j) {
				num[i] = num[i] + 1;
			}
			System.out.print(num[i] + " ");
		}

	}

}
