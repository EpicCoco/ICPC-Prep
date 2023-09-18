import java.util.HashSet;
import java.util.Scanner;
class NoDup {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
    	System.out.println(checkDups(input) ? "no" : "yes");
    } //main
    
    public static boolean checkDups(String input) {
    	String[] words = input.split(" ");
    	HashSet<String> hs = new HashSet<String>();
    	for (String s : words) {
    		if (!hs.add(s)) {
    			return true;
    		} //if
    	} //for
    	return false;
    } //checkDups
} //NoDup