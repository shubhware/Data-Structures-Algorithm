//Search in rotated & sorted ArrayList

// Optimized Method (Two-Pointer Approach) --> Time complexity: O(n)
import java.util.*;

public class Pair_Sum_2 {
    public static ArrayList<String> pairSumInRotatedSortedArrayList(ArrayList<Integer> list, int target,ArrayList<String> finalPair) {
        // Finding break point.
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) { // Sorted Condition fails and this point is called break point.
                bp = i;
                break;
            }
        }
        // Initialization of left pointer & right pointer.
        int left_ptr = bp + 1; // smallest value
        int right_ptr = bp; // largest value

        while (left_ptr != right_ptr) {
            int sum = list.get(left_ptr) + list.get(right_ptr);
            // Case-1
            if (sum == target) {
                finalPair.add("(" + list.get(left_ptr) + ", " + list.get(right_ptr) + ")");
                left_ptr = (left_ptr + 1) % n;
                right_ptr = (n + right_ptr - 1) % n;
            }
            // Case-2
            else if (sum < target) {
                left_ptr = (left_ptr + 1) % n;  // Rotated Movement of ptr using Modular Arithmetic Formulas
            }
            // Case-3
            else {
                right_ptr = (n + right_ptr - 1) % n;    //Rotated Movement of ptr using Modular Arithmetic Formulas
            }
        }
        return finalPair;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int len = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            System.out.print("Enter the value: ");
            list.add(sc.nextInt());
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        ArrayList<String> finalPair = new ArrayList<>();
        System.out.println("Final Pairs: " + pairSumInRotatedSortedArrayList(list, target, finalPair));
        sc.close();
    }
}
