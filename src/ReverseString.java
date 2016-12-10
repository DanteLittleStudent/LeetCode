

/*LeetCode-344 Reverse String
 *Write a function that takes a string as input and returns the string reversed.
 *Example: Given s = "hello", return "olleh".
 *Subscribe to see which companies asked this question
 */


import java.util.Stack;

public class ReverseString {
	public String reverseString(String s){
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length(); i++){
			char temp = s.charAt(i);
			stack.add(temp);
		}
		s = "";
		while(!stack.empty()){
			s = s + stack.pop();
		}
		return s;
	}
}
