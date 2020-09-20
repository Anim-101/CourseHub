public class CountNode {
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

    public int countNodes() {
        int count = 0;

        Node current = head;

        while(current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public void Display() {
        Node current = head;

        if(head == null) {
            System.out.println("Linkded List is Empty");
            return;
        }

        System.out.print("\nNodes in Singly Linked List: ");

        while(current != null) {

            System.out.print(current.data + " ");

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String [] args) {
        CountNode singlyLinedList = new CountNode();

        singlyLinedList.addNode(1);
        singlyLinedList.addNode(2);
        singlyLinedList.addNode(3);
        singlyLinedList.addNode(4);

        singlyLinedList.Display();

        System.out.println("\nCount of Nodes present in this List: " + singlyLinedList.countNodes());
    }
}