import java.util.*;

public class spiralArrayPrint2D {
    public static void printSpiral(int arr[][]) {
        int startRow = 0, endRow = arr.length - 1;// 3
        int startCol = 0, endCol = arr[0].length - 1;// 3
        while (startRow <= endRow && startCol <= endCol) {
            // top print
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(arr[startRow][col] + " ");
            }
            // right print
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(arr[row][endCol] + " ");
            }
            // bottom print
            for (int col = endCol - 1; col >= startCol; col--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][col] + " ");
            }
            // left print
            for (int row = endRow - 1; row >= startRow + 1; row--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[row][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the value: ");
                arr[i][j] = sc.nextInt();
            }
        }

        printSpiral(arr);
        sc.close();
    }
}
