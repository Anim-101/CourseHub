public class SearchLinkedList {
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

    public void searchNode(int data) {
        Node current = head;

        int i = 1;
        boolean flag = false;

        if(head == null) {
            System.out.println("List is Empty");
        } else {
            while(current != null) {
                if(current.data == data) {
                    flag = true;

                    break;
                }
                i++;

                current = current.next;
            }
        }

        if(flag) {
            System.out.println("\nElement is present in the list at the position: " + i);
        } else {
            System.out.println("\nElement is not present in the list");
        }
    }

    public static void main(String [] args) {
        SearchLinkedList list = new SearchLinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);

        list.searchNode(2);

        list.searchNode(7);
    }
}