package leetCode.easy;

public class CanPlaceFlowers {

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int len = flowerbed.length;

		for (int i = 0; i < len; i++) {

			if (flowerbed[i] == 0) {
				//chcking weather the left and right element is 0 or not
				boolean left = (i == 0 || flowerbed[i - 1] == 0);//(i == 0) to handle the index out of bound exception.
				boolean right = (i == len - 1 || flowerbed[i + 1] == 0);//(i == len - 1) to handle the index out of bound exception.

				if (left && right) {//if the left and right is 0. It will add 1 in this position and decrement the n value.
					flowerbed[i] = 1;
					n--;
				}
				if (n == 0) {//If n value is 0 it will return true. Insted of executing the entire loop it will terminate here.
					return true;
				}
			}

		}

		return n <= 0;//If n value is not equales to 0 if will return false.
	}

	public static void main(String[] args) {
		int[] flowerbed = { 1, 0, 0, 0, 1};
		int n = 1;
		boolean result = canPlaceFlowers(flowerbed, n);

		System.out.println(result);

	}

}
/* Time complexity is O(n) where n is the length of flowerbed array
 * Space complexity is O(1)
 * And "Greedy Algorithm" is used to solve this problem*/