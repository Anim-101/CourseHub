public class DeleteNodeMiddle {
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

    public int size;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    void deleteFromMiddle() {
        Node temp, current;

        if(head == null) {
            System.out.println("List is Empty");
            return;
        } else {
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

            if(head != tail) {
                temp = head;

                current = null;

                for(int i = 0; i < count - 1; i++) {
                    current = temp;

                    temp = temp.next;
                }

                if(current != null) {
                    current.next = temp.next;

                    temp = null;
                } else {
                    head = tail = temp.next;

                    temp = null;
                }
            } else {
                head = tail = null;
            }
        }

        size--;
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
        DeleteNodeMiddle deleteMiddleNode = new DeleteNodeMiddle();

        deleteMiddleNode.addNode(1);
        deleteMiddleNode.addNode(2);
        deleteMiddleNode.addNode(3);
        deleteMiddleNode.addNode(4);

        System.out.print("\nOriginal List: ");

        deleteMiddleNode.Display();

        while(deleteMiddleNode.head != null) {
            deleteMiddleNode.deleteFromMiddle();

            System.out.print("\nUpdated List: ");

            deleteMiddleNode.Display();
        }
    }
}