import java.util.*;

public class CountSetBits {
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Binary Representation is: " + Integer.toBinaryString(n));
        System.out.println("No. of set bits are: " + countSetBits(n));
        sc.close();
    }
}
