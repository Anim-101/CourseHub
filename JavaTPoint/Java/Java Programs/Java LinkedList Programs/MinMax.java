public class MinMax {
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

    public void minNode() {
        Node current = head;

        int min;

        if(head == null) {
            System.out.println("List is Empty");
        } else {
            min = head.data;

            while(current != null) {
                if(min > current.data) {
                    min = current.data;
                }

                current = current.next;
            }

            System.out.println("\nMinimum Value of Node in the List: " + min);
        }
    }

    public void maxNode() {
        Node current = head;

        int max;

        if(head == null) {
            System.out.println("List is Empty");
        } else {
            max = head.data;

            while(current != null) {
                if(max < current.data) {
                    max = current.data;
                }

                current =  current.next;
            }

            System.out.println("\nMaximum Value of Node in the List: " + max);
        }
    }

    public static void main(String [] args) {
        MinMax list = new MinMax();

        list.addNode(5);
        list.addNode(8);
        list.addNode(1);
        list.addNode(6);

        list.minNode();

        list.maxNode();
    }
}