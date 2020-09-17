public class InsertStart {
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

    public void addAtStart(int data) {
        Node newNode = new Node(data);
         
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    public void Display() {
        Node current = head;

        if(head == null) {
            System.out.println("Life is Empty");

            return;
        }

        System.out.print("\nAdding notes to the start of the list: ");

        while(current != null) {
            System.out.print(current.data + " ");

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String [] args) {
        InsertStart list = new InsertStart();

        list.addAtStart(1);

        list.Display();

        list.addAtStart(2);

        list.Display();

        list.addAtStart(3);

        list.Display();

        list.addAtStart(4);

        list.Display();
    }
}