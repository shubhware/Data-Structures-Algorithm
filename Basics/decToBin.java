import java.util.*;

public class decToBin {
    public static int getDecimalToBinary(int decValue) {
        int binValue = 0;
        int pow = 0;
        while (decValue > 0) {
            int rem = decValue % 2;
            binValue += rem * (Math.pow(10, pow));
            pow++;
            decValue /= 2;
        }
        return binValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal value: ");
        int dec = sc.nextInt();
        int binValue = getDecimalToBinary(dec);
        System.out.println("The binary value is: " + binValue);
        sc.close();
    }
}
