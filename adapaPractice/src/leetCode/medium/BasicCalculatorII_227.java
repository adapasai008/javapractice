package leetCode.medium;

import java.util.Stack;

public class BasicCalculatorII_227 {

	public static int calculator(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}

		Stack<Integer> stack = new Stack<>();
		char sign = '+';
		int num = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isDigit(c)) {
				num = num * 10 + (c - '0');
			}

			if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == str.length() - 1) {
				if (sign == '+') {
					stack.push(num);
				} else if (sign == '-') {
					stack.push(-num);
				} else if (sign == '*') {
					stack.push(stack.pop() * num);
				} else if (sign == '/') {
					stack.push(stack.pop() / num);
				}

				sign = c;
				num = 0;
			}
		}

		int result = 0;
		while (!stack.isEmpty()) {
			result += stack.pop();
		}

		return result;
	}

	public static void main(String[] args) {
		String str = "6-2*2";
		int result = calculator(str);
		System.out.println(result);
	}

}
