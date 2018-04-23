package com.example.stackqueue;

public class BalancedParan {
	public static void main(String[] args) {
		char exp[] = { '{', '(', ')', '}', '[', ']' };
		if (areParenthesisBalanced(exp))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

	static boolean areParenthesisBalanced(char exp[]) {
		StackImpl<Character> st = new StackImpl<>();

		for (int i = 0; i < exp.length; i++) {
			if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
				st.push(exp[i]);

			if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

				if (st.isEmpty()) {
					return false;
				}

				else if (!isMatchingPair(st.pop(), exp[i])) {
					return false;
				}
			}
		}

		if (st.isEmpty())
			return true;
		else { 
			return false;
		}
	}
	
	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}
}
