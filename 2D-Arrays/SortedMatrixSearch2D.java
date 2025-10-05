import java.util.*;

public class SortedMatrixSearch2D {
    public static boolean searchInSortedMatrix(int arr[][], int key) {
        int row = 0;
        int col = arr.length - 1;
        boolean flag = false;
        while (row <= arr.length - 1 && col >= 0) {
            if (arr[row][col] == key) {
                return flag = true;
            } else if (arr[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the value: ");
                arr[i][j] = sc.nextInt();
            }
        }
        if (searchInSortedMatrix(arr, key)) {
            System.out.println("Key found!");
        } else {
            System.out.println("Key not found!");
        }
        sc.close();
    }
}
