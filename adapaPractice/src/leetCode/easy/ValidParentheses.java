package leetCode.easy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// it should take one brackets and parentheses and check weather the brackets
		// are
		// closed or not
		// (),{},[] it should print true

		String s = "[]{}";
		boolean isValid = true;

		Stack<Character> stack = new Stack<Character>();

		for(char ch : s.toCharArray()) {
			if(ch == '(' || ch == '{'|| ch == '[') {
				stack.push(ch);
			}else {
				if(stack.isEmpty()) {
					isValid = false;
					break;
				}
				char top = stack.pop();
				if((ch == ')' && top != '(') ||
				   (ch == ']' && top != '[') ||
				   (ch == '}' && top != '{') ) {
					isValid = false;
					break;
				}

			}
		}
		
		if(!stack.isEmpty()) {
			isValid = false;
		}
		System.out.println(isValid);
	}
}
