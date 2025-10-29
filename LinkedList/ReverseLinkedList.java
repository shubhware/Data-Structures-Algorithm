public class ReverseLinkedList {

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

    public int recursiveSearch(Node head, int key) { // Recursive Search for a key.
        // Base Case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = recursiveSearch(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public void reverse(){
        Node prev = null;   // starting prev = null, curr = head, next initialized.
        Node curr = head;
        Node next;
        while (curr != null) {  // loop stops after iterating all nodes and current becomes null.
            next = curr.next;   // curr.next contains reference to next node.
            curr.next = prev;   // reverse the current by referring curr's next to prev.
            prev = curr;    // move the prev as it becomes curr and curr changes to next node.
            curr = next;
        }
        head = prev;    // At last curr = null. So prev becomes head.
    }
    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(4);
        ll.addMiddle(2, 3);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
