import java.util.*;

public class LinkedList_1 {

    // Class for Node
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

    public void addFirst(int data) {

        // Step1: Create a newNode.
        Node newNode = new Node(data);

        // Step2: Check if LinkedList is empty or not!
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step3: If not null then newNode's next = head.
        newNode.next = head;

        // Step4: Then change head to newNode.
        head = newNode;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList_1 ll = new LinkedList_1();
        System.out.print("Enter how many node's to create using addFirst() : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the data: ");
            ll.addFirst(sc.nextInt());
        }
        System.out.println("LinkedList created.");
        sc.close();
    }
}