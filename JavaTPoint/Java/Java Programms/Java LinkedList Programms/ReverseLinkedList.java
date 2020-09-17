public class ReverseLinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void Reverse(Node current) {
        if(head == null) {
            System.out.println("List is Empty");
        } else {
            if(current.next == null) {
                System.out.print(current.data + " ");

                return;
            }

            Reverse(current.next);
            System.out.print(current.data + " ");
        }
    }

    public void Display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is Empty");

            return;
        }

        while(current != null) {
            System.out.print(current.data + " ");

            current = current.next;
        }

        System.out.println();
    }


    public static void main(String [] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        reverseLinkedList.addNode(1);
        reverseLinkedList.addNode(2);
        reverseLinkedList.addNode(3);
        reverseLinkedList.addNode(4);

        System.out.print("\nOriginal List: ");

        reverseLinkedList.Display();

        System.out.print("\nReversed List: ");

        reverseLinkedList.Reverse(reverseLinkedList.head);

        System.out.println();
    }
}