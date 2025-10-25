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

        System.out.println("Pair_Sum: " + pair_Sum_1(list, target, finalPair));
        sc.close();
    }
}
