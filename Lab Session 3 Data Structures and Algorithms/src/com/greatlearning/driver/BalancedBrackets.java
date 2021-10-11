package com.greatlearning.driver;
import java.util.Stack;


public class BalancedBrackets {
	
	private static boolean areBalanced( String bracketInput ) {
	 Stack stack = new Stack();
	 
	 for ( char c : bracketInput.toCharArray() ) {
		if (c == '{' || c == '[' || c == '('){
			stack.push(c);
			
			
		}else {
			if(stack.isEmpty()) {
				return false;
			}
			
			Character d = (Character) (stack.pop());
			if ((c == '}' && d != '{') || (c == ')' && d != '(') || (c == ']' && d != '[')) {
				return false;
			
				
			}
			
		}
			
	}
	 return stack.isEmpty();
 }
	
     
	public static void main (String[] args) {
		
		String bracketInput = "([[{}]])";
		if( areBalanced ( bracketInput ) ) {
			System.out.println("Brackets are Balanced");
		}
		else {
			System.out.println("Brackets are not Balanced");
			
		}
			
			
		
		
				
	}
} 
