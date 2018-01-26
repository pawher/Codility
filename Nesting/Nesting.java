package Nesting;

import java.util.Stack;

public class Nesting {

	public int solution(String S) {

		if (S.isEmpty()) {
			return 1;
		}
		
		if (S.length() % 2 == 1 || S.isEmpty() || S.charAt(0) == ')' || S.charAt(S.length() - 1) == '(') {
			return 0;
		}

		Stack<Character> stack = new Stack<>();
		for (char k : S.toCharArray()) {
			if (k == '(') {
				stack.push(k);
			} else {
				if (stack.isEmpty()) {
					return 0;
				} else {
					stack.pop();
				}
			}
		}

		return stack.isEmpty() ? 1 : 0;
	}
}
