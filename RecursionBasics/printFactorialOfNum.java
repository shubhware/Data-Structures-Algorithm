import java.util.*;

public class printFactorialOfNum {
    public static int factorial(int num) {
        // Base Case
        if (num == 0 || num == 1) {
            return 1;
        }
        //Work
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The factorial of " + num + " is: " + factorial(num) + ".");
        sc.close();
    }
}
