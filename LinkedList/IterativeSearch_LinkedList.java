public class IterativeSearch_LinkedList {

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

    public int removeFirst() { // returns deleted node's value from first
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

    public int removeLast() { // returns deleted node's value from last
        if (size == 0) {
            System.out.println("Underflow!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data; // val = temp.next.data
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int itr_Search(int key) { // Search iteratively for a key.
        int idx = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public static void main(String[] args) {
        IterativeSearch_LinkedList ll = new IterativeSearch_LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(4);
        ll.addMiddle(2, 3);
        ll.print();
        System.out.println(ll.itr_Search(3));
    }
}