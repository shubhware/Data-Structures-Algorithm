import java.util.*;

public class Swap {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            list.add(sc.nextInt());
        }
        System.out.println("Created ArrayList: " + list);
        System.out.print("Enter the indices to be swapped : ");
        int idx1 = sc.nextInt(), idx2 = sc.nextInt();
        swap(list, idx1, idx2);
        System.out.println("ArrayList after swapping: " + list);
        sc.close();
    }
}
