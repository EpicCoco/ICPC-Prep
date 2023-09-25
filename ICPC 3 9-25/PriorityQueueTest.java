import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		
		//by default, acts as a minheap (minimum on top)
		//can use a custom comparator to change the order
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		//add list to priority queue
		List<Integer> list = Arrays.asList(5, 6, 9, 1, 7, 4, 3, 2);
		pq.addAll(list);
		
		//take the top (smallest) element
		System.out.println("Smallest element: " + pq.poll());
		
		//take the next smallest element
		System.out.println("Next smallest element: " + pq.poll());
		
	} //main
} //PriorityQueueTest
