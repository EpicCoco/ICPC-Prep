import java.util.Scanner;
import java.util.Stack;

class EvenUpSolitare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numLines = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < numLines; i++) {
			int num = sc.nextInt();
			//if the next item in input and in stack have same 
			//parity, then clear both and move on
			//else, put that number on the stack
			if (!stack.empty() && num % 2 == stack.peek() % 2) {
				stack.pop();
			} else {
				stack.push(num);
			} //if
		} //for
		//stack size is rermaining unpaired numbers
		System.out.println(stack.size());
	} //main
	
} //EvenUpSolitare
