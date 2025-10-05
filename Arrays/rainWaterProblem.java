import java.util.*;

public class rainWaterProblem {
    public static int trappingRainWater(int height[], int n, int width) {
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += (Math.min(leftMax[i], rightMax[i]) - height[i]) * width;
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();
        int height[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            height[i] = sc.nextInt();
        }
        System.out.print("The height array entered is: ");
        for (int x : height) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Enter the width: ");
        int width = sc.nextInt();
        System.out.println("Total rain water trapped is: " + trappingRainWater(height, n, width));
        sc.close();
    }
}
