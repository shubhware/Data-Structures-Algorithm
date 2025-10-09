import java.util.*;

public class SumOfNaturalNum {
    public static int sumOfNaturalNo(int num) {
        // Base Case
        if (num == 1) {
            return 1;
        }
        return num + sumOfNaturalNo(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Sum of " + num + " natural num is: " + sumOfNaturalNo(num));
        sc.close();
    }
}
