import java.util.*;

public class subArrays {

    public static void printSubArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int totalSubArrays(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                tp += 1;
            }
        }
        return tp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        printSubArrays(arr);
        System.out.println();
        System.out.println("The total SubArrays is [n*(n+1)]/2 : " + totalSubArrays(arr));
        sc.close();
    }
}
