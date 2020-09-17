public class SinglyLinkedListDisplay {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Representing Head and Tail of Singly Linked List
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void Display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is Empty!");
            return;
        }

        System.out.print("\nNode of Singly Linked List: ");

        while(current != null) {
            System.out.print(current.data + " ");

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String [] args) {
        SinglyLinkedListDisplay linkedList = new SinglyLinkedListDisplay();

        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);

        linkedList.Display();
    }
    
}