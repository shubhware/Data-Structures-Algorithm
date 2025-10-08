import java.util.*;

public class ClearIthBit {
    public static int clearIthBit(int num, int index) {
        int bitMask = ~(1<<index);
        return num & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println("Binary representation: " + Integer.toBinaryString(n));
        int output = clearIthBit(n, index);
        System.out.println("After clearing ith bit: " + Integer.toBinaryString(output));
        sc.close();
    }
}
