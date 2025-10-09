import java.util.*;

public class ClearLastiBits {
    public static int clearIBits(int num, int i) {
        int bitMask = ~(0) << i;
        return num & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        System.out.println("Enter the i bits: ");
        int i = sc.nextInt();
        System.out.println("Binary representation: " + Integer.toBinaryString(n));
        int output = clearIBits(n, i);
        System.out.println("Binary representation: " + Integer.toBinaryString(output));
        sc.close();
    }
}
