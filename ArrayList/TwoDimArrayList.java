import java.util.*;

public class TwoDimArrayList {
    public static void print2dArrayList(ArrayList<ArrayList<Integer>> mainList) {
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many sub-lists: ");
        int r = sc.nextInt();

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            ArrayList<Integer> list1 = new ArrayList<>();
            System.out.print("Enter how many cols in this list : ");
            int c = sc.nextInt();

            for (int j = 0; j < c; j++) {
                System.out.print("Enter the value: ");
                list1.add(sc.nextInt());
            }

            mainList.add(list1);
        }

        print2dArrayList(mainList);
        sc.close();
    }
}
