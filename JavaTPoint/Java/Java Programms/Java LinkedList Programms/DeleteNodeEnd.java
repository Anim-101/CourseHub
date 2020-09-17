public class DeleteNodeEnd {
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

    public void deleteFromEnd() {
        if(head == null) {
            System.out.println("List is Empty");

            return;
        } else {
            if(head != tail) {
                Node current = head;

                while(current.next != tail) {
                    current = current.next;
                }

                tail = current;
                tail.next = null;
            } else {
                head = tail = null;
            }
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
        DeleteNodeEnd deleteNodeEnd = new DeleteNodeEnd();

        deleteNodeEnd.addNode(1);
        deleteNodeEnd.addNode(2);
        deleteNodeEnd.addNode(3);
        deleteNodeEnd.addNode(4);

        System.out.print("\nOriginal List: ");

        deleteNodeEnd.Display();

        while(deleteNodeEnd.head != null) {
            deleteNodeEnd.deleteFromEnd();

            System.out.print("\nUpdated List: ");

            deleteNodeEnd.Display();
        }
    }
}