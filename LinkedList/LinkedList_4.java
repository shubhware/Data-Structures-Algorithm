import java.util.Scanner;

public class LinkedList_4 {
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

    // addMiddle method
    public void addMiddle(int idx, int data) {
        // Check if LinkedList is empty.
        if (head == null) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1) { // For example - to insert at 2nd idx, we need to stop at 1st index.
            temp = temp.next;
            i++;
        }
        // i = idx - 1 i.e we got our previous node.
        Node newNode = new Node(data); // create newNode
        newNode.next = temp.next; // temp acts as previous.
        temp.next = newNode;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList_4 ll = new LinkedList_4();
        System.out.print("Enter how many node's to create using addLast() : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the data: ");

            ll.addLast(sc.nextInt()); // addLast() called.
        }
        ll.print(); // prints created Linked List.

        System.out.println("Enter the index where to add in middle:  ");
        int idx = sc.nextInt();
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        ll.addMiddle(idx, data); // Insert at idx.
        ll.print(); // Prints Modified LinkedList.
        sc.close();
    }
}
