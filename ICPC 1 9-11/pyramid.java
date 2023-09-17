import java.util.Scanner;
class Pyramids {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(countPyramid(input));
    } //main
    
    public static int countPyramid(int blocks) {
        int blocksUsed = 0;
        int count = 1;
        while (blocksUsed < blocks + 1) {
            blocksUsed += (int) Math.pow((count * 2) - 1, 2);
            count++;
        } //while
        return count - 2;
    } //countPyramid
} //pyramids