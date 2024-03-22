package leetCode.easy;

public class LongestCommonPrefix {

	public static String commonPrifx(String[] str) {
		String prefix = str[0];

		for (int i = 1; i < str.length; i++) {
			while (str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;

	}

	public static void main(String[] args) {

		String[] str = { "flower", "flow", "flight" };

		String result = commonPrifx(str);

		System.out.println(result);

	}

}
