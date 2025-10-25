
// Optimized using Two-Pointer Approach --> Time complexity => O(n)
import java.util.*;

public class Optimized_ContainerWithMostWater {

    public static int storedWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int left_ptr = 0, right_ptr = height.size() - 1;
        while (left_ptr < right_ptr) {
            int currHeight = Math.min(height.get(left_ptr), height.get(right_ptr));
            int currWidth = right_ptr - left_ptr;
            int currWater = currHeight * currWidth;
            maxWater = Math.max(currWater, maxWater);

            if (height.get(left_ptr) < height.get(right_ptr)) {
                left_ptr++;
            } else {
                right_ptr--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements: ");
        int n = sc.nextInt();
        ArrayList<Integer> height = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            height.add(sc.nextInt());
        }
        System.out.println("Created list: " + height);
        System.out.println("Max Stored Water: " + storedWater(height));
        sc.close();
    }
}
