public class InsertMid {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size;

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

        size++;
    }

    public void addInMid(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp, current;

            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

            temp = head;

            current = null;

            for(int i = 0; i < count; i++) {
                current = temp;
                temp = temp.next;
            }

            current.next = newNode;
            newNode.next = temp;
        }

        size++;
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
        InsertMid list = new InsertMid();

        list.addNode(1);
        list.addNode(2);

        System.out.print("\nOriginal List: ");

        list.Display();

        list.addInMid(3);

        System.out.print("\nUpdated List: ");

        list.Display();
    }
}