import java.util.*;

public class ReverseOfArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the value : ");
            list.add(sc.nextInt());
        }
        System.out.println("Entered list: " + list);
        System.out.print("Reverse of a list is: ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        sc.close();
    }    
}
