import java.util.*;

public class Pair_Sum_1 {

    public static ArrayList<String> pair_Sum_1(ArrayList<Integer> list, int target, ArrayList<String> finalPair) {
        // Brute-force method -> Time complexity: O(n^2)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    finalPair.add("(" + list.get(i) + "," + list.get(j) + ")");
                }
            }
        }
        return finalPair;
    }

    public static ArrayList<String> pair_Sum_1_Optimized(ArrayList<Integer> list, int target,ArrayList<String> finalPair) {
        int left_ptr = 0, right_ptr = list.size() - 1;

        while (left_ptr < right_ptr) {
            int sum = list.get(left_ptr) + list.get(right_ptr);

            if (sum == target) {
                finalPair.add("(" + list.get(left_ptr) + ", " + list.get(right_ptr) + ")");
                left_ptr++;
                right_ptr--;
            } else if (sum < target) {
                left_ptr++;
            } else {
                right_ptr--;
            }
        }
        return finalPair;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of list: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            list.add(sc.nextInt());
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        ArrayList<String> finalPair = new ArrayList<>();

        // System.out.println("Pair_Sum: " + pair_Sum_1(list, target, finalPair));
        System.out.println("Pair_Sum: " + pair_Sum_1_Optimized(list, target, finalPair));
        sc.close();
    }
}
