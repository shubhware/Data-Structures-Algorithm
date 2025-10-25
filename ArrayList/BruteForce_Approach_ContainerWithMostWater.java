//Brute-Force Approach - Time Complexity : O(n^2)
import java.util.*;

public class BruteForce_Approach_ContainerWithMostWater {

    public static int containerWithMostWater(ArrayList<Integer> height) {
        int maxWater = Integer.MIN_VALUE;   // -Infinity or 0
        // Find all possible pairs
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int minHeight = Math.min(height.get(i), height.get(j));
                int totalWidth = j - i; // Index of Line2 - Index of Line1
                int water = minHeight * totalWidth;
                maxWater = Math.max(water,maxWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> height = new ArrayList<>();
        System.out.println("Enter how many elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            height.add(sc.nextInt());
        }
        System.out.println("Height : " + height);
        System.out.println("Max Water possible to store is : " + containerWithMostWater(height));
        sc.close();
    }
}
