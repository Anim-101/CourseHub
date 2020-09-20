public class InsertEnd {
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

    public void addAtEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
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
            System.out.println("List is Empty");
            return;
        }

        System.out.print("\nAdding Ndoes to end of the list: ");

        while(current != null) {
            System.out.print(current.data + " ");

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String [] args) {
        InsertEnd list = new InsertEnd();

        list.addAtEnd(1);
        list.Display();
        
        list.addAtEnd(2);
        list.Display();
        
        list.addAtEnd(3);
        list.Display();
        
        list.addAtEnd(4);
        list.Display();
    }
}