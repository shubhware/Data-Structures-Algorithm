/* Time Complexity is: O(n) */

import java.util.*;

public class kadanesAlgorithm {
    public static int kadanes_algo(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }

        int max = kadanes_algo(arr);
        System.out.println(max);
        sc.close();
    }
}
