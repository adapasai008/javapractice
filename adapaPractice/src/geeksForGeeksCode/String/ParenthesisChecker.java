package geeksForGeeksCode.String;

import java.util.Stack;

public class ParenthesisChecker {

	static boolean isValid(String str) {
		Stack<Character> seen = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '(' || ch == '[' || ch == '{') {
				seen.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {

				if (seen.empty()) {
					return false;
				}
				char top = seen.pop();
				if (!match(top, ch)) {
					return false;
				}

			}

		}
		return seen.isEmpty();

	}

	static boolean match(char top, char end) {
		return (top == '(' && end == ')' || top == '[' && end == ']' || top == '{' && end == '}');
	}

	public static void main(String[] args) {
		String str = "(){()}";

		boolean result = isValid(str);

		System.out.println(result);

	}

}
