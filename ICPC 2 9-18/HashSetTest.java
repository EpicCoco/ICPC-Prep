import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
	
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Germany");
		hs.add("Italy");
		hs.add("France");
		hs.add("Spain");
		
		System.out.println("hashset contains 'Germany': " + hs.contains("Germany"));
		
		boolean addedGermanyDuplicate = hs.add("Germany");
		System.out.println(addedGermanyDuplicate);
		
	} //main
	
} //HashSetTest
