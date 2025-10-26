import java.util.Scanner;

public class LinkedList_3 {
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

    // addFirst method
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

    // addLast method
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

    // print method
    public void print() {
        // Base Case
        if (head == null) {
            System.out.println("LinkedList is empty !");
            return;
        }
        Node temp = head; // temp reference to head
        while (temp != null) {
            System.out.print(temp.data + "->"); // print current data
            temp = temp.next; // move to next
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList_3 ll = new LinkedList_3();

        ll.print(); //prints when LinkedList is empty.

        System.out.print("Enter how many node's to create using addLast() : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the data: ");
            
            ll.addLast(sc.nextInt());   //addLast() called

            ll.print();     //prints every node after adding.
        }
        sc.close();
    }
}
