import java.util.*;

public class lastOccurenceInArray {
    public static int lastOccurence(int arr[], int key, int i) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }
        // Work
        int result = lastOccurence(arr, key, i + 1);
        if (result == -1) {
            if (arr[i] == key) {
                return i;
            }
        }
        return result;
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

        System.out.print("Enter the element to be find: ");
        int key = sc.nextInt();

        int idx = lastOccurence(arr, key, 0);
        System.out.println("Last occurence of " + key + " is at index: " + idx + " !");
        sc.close();
    }
}
