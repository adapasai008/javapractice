package leetCode.medium;

public class Container_With_Most_Water_11 {

	public static int maxArea(int[] height) {

		int start = 0;
		int end = height.length - 1;
		int result = 0;

		while (start < end) {
			int width = end - start;
			int area = width * Math.min(height[start], height[end]);
			result = Math.max(result, area);

			if (height[start] < height[end]) {
				start++;
			} else {
				end--;
			}
		}

		return result;

	}

	public static void main(String[] args) {

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		int result = maxArea(height);

		System.out.println(result);

	}

}
