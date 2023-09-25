import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		
		//store as Queue to only operate on first/last elements
		//linked list will operate in the same way - 
		//it implements Queue (which is an interface)
		//only uses methods from Queue interface
		Queue<String> queue = new LinkedList<String>();
		
		//offer to enqueue
		queue.offer("John"); //first in
		queue.offer("Mike"); //second in
		queue.offer("Jacob"); //third in
		
		//poll will dequeue the first element
		System.out.println("first out: " + queue.poll());
		
		//looking at the next element
		System.out.println("Next up: " + queue.peek());
		
	} //main
} //QueueTest
