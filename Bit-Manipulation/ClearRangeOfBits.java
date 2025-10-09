import java.util.*;

public class ClearRangeOfBits {
    public static int clearRangeOfBits(int num, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return num & bitMask;
    }                             

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Entered value in binary: " + Integer.toBinaryString(n));
        System.out.print("Enter the range ie start and end: ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int output = clearRangeOfBits(n, i, j);
        System.out.println("After clearing range of bits: " + Integer.toBinaryString(output));
        sc.close();
    }
}
