import java.util.Scanner;

public class LicenseToLaunch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numItems = sc.nextInt();
		int[] items = new int[numItems];
		for (int i = 0; i < numItems; i++) {
			items[i] = sc.nextInt();
		} //for
		System.out.println(findMinIndex(items));
	} //main
	
	public static int findMinIndex(int[] nums) {
		int min = nums[0];
    	int index = 0;
    	for (int i = 1; i < nums.length; i++) {
    		if (nums[i] < min) {
    			min = nums[i];
    			index = i;
    		} //if
    	} //for
    	return index;
	} //findMinIndex
	
} //LicenseToLaunch
