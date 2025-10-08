import java.util.*;

public class SetIthBit {
    public static int setIthBit(int num, int index) {
        int bitMask = 1<<index;
        return num | bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter ith index: ");
        int index = sc.nextInt();
        System.out.println("Binary representation: " + Integer.toBinaryString(n));
        int output = setIthBit(n, index);
        System.out.println("After setting ith bit: " + Integer.toBinaryString(output));
        sc.close();
    }

}
