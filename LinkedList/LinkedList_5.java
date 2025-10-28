public class LinkedList_5 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) { // constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { // add in the start
        Node newNode = new Node(data);
        if (size == 0) {
            head = tail = newNode;
            size = 1;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) { // add in the last
        Node newNode = new Node(data);
        if (size == 0) {
            head = tail = newNode;
            size = 1;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void addMiddle(int idx, int data) { // add in the middle
        Node newNode = new Node(data);
        if (size == 0) {
            head = tail = newNode;
            size = 1;
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void print() { // print all elements in LinkedList
        if (size == 0) {
            System.out.println("LinkedList is empty !");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() { // returns deleted node's value
        if (size == 0) {
            System.out.println("Underflow!");
            return Integer.MIN_VALUE; // -infinity
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList_5 ll = new LinkedList_5();
        ll.addFirst(1);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addMiddle(2, 3);
        ll.print();
        System.out.println(ll.removeFirst());
        ll.print();
    }
}
