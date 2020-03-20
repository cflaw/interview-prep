package pcs.qns3;

import java.util.Stack;

public class qns3 {
	public boolean checkBrackets(String message) {
		message = message.replaceAll("\\s","");
		
		Stack<Character> stack = new Stack<Character>();
		for (char c : message.toCharArray()) {
			
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
}
