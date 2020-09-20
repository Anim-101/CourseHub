public class CircularLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void Display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is Empty");
        } else {
            System.out.print("\nNodes of The Circular Linked List:");

            do {
                System.out.print(" " + current.data);
                
                current = current.next;
            } while(current != head);

            System.out.println();
        }
    }

    public static void main(String [] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);

        list.Display();
    }
}