import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		//  Key		  Value
		int hundred = 100;
		//not exactly how it works, but good analogy
		
		//      Keys    Values
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		//ArrayList<String> al = new ArrayList<String>();
		
		hm.put("ten", 10);
		hm.put("thousand", 1000);
		hm.put("million", 1000000);
		
		System.out.println("hashmap get 'thousand': " + hm.get("thousand"));
		
		System.out.println("hashmap contains 1000: " + hm.containsValue(1000));
		
	} //main
	
} //HashMapTest
