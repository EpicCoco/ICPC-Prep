import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("John"); //first in
		stack.push("Mike"); //second in
		stack.push("Jacob"); //third in
		
		//pop out top item
		System.out.println("First out: " + stack.pop());
		
		//peek at top item (but don't remove it) - also known as top
		System.out.println("Next up: " + stack.peek());
		
	} //main
} //StackTest
