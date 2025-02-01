class DoublyLinkedList {
    // Node class for doubly linked list
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Head and tail of the list
    private Node head;
    private Node tail;

    // Insert at the front of the list
    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at the end of the list
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Delete a node with a specific value
    public void deleteNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Node with value " + data + " not found.");
    }

    // Display the list in forward order
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display the list in reverse order
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFront(10);
        dll.insertEnd(20);
        dll.insertFront(5);
        dll.insertEnd(30);

        System.out.print("Forward: ");
        dll.displayForward(); // Output: 5 10 20 30

        System.out.print("Backward: ");
        dll.displayBackward(); // Output: 30 20 10 5

        dll.deleteNode(20);
        System.out.print("After deletion of 20: ");
        dll.displayForward(); // Output: 5 10 30
    }
}
