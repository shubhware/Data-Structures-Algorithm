import java.util.Scanner;

public class LinkedList_2 {
    public static class Node {
        int data; // Data member
        Node next; // Data member

        public Node(int data) { // Constructor
            this.data = data;
            this.next = null;
        }
    }

    // head & tail of linked list
    public static Node head;
    public static Node tail;

    public void addLast(int data) {

        // Step1: Create a newNode.
        Node newNode = new Node(data);

        // Step2: Check if LinkedList is empty or not!
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step3: If not null then tail's next refer to newNode rather than referring to
        // null.
        tail.next = newNode;

        // Step4: Then change tail to newNode.
        tail = newNode;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList_2 ll = new LinkedList_2();
        System.out.print("Enter how many node's to create using addLast() : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the data: ");
            ll.addLast(sc.nextInt());
        }
        System.out.println("LinkedList created.");
        sc.close();
    }
}
