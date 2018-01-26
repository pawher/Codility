package Brackets;

import java.util.Stack;

public class Brackets {

	public int solution(String S) {

		if (S.isEmpty()) {
			return 1;
		}
		
		if (S.length() % 2 == 1) {
			return 0;
		}

		Stack<Character> stack = new Stack<>();
		
		for (char k : S.toCharArray()) {
			if ("{([".indexOf(k) != -1) {
				stack.push(k);
			} else {
				if (stack.isEmpty()) {
					return 0;
				}
				if (k == ')') {
					if (k - stack.pop() != 1) {
						return 0;
					}
				} else {
					if (k - stack.pop() != 2) {
						return 0;
					}
				}
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}
}
