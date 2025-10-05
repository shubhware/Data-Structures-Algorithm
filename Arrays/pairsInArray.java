/* Time Complexity is: O(n^2) */

import java.util.*;

public class pairsInArray {
    public static void printPairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static int totalPairs(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                tp += 1;
            }
        }
        return tp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        System.out.println();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
        printPairs(arr);
        int tp = totalPairs(arr);
        System.out.println("Total pairs in SubArray is [n*(n-1)]/2: " + tp);
    }
}
