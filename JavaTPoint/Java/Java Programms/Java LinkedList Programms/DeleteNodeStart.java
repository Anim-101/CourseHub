public class DeleteNodeStart {
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

    public void deleteFromStart() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        } else {
            if(head != tail) {
                head = head.next;
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
        DeleteNodeStart deleteNodeStart = new DeleteNodeStart();

        deleteNodeStart.addNode(1);
        deleteNodeStart.addNode(2);
        deleteNodeStart.addNode(3);
        deleteNodeStart.addNode(4);

        System.out.print("\nOriginal List: ");

        deleteNodeStart.Display();

        while(deleteNodeStart.head != null) {
            deleteNodeStart.deleteFromStart();

            System.out.print("\nUpdated List: ");

            deleteNodeStart.Display();
        }
    }
}