public class SinglyLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void Display() {
        Node node = head;

        while(node != null) {
            System.out.print(node.data + "\n");

            node = node.next;
        }
    }

    public static void main(String [] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.head = new Node(100);
        Node secondNode = new Node(200);
        Node thirdNode = new Node(300);

        singlyLinkedList.head.next = secondNode;
        secondNode.next = thirdNode;

        singlyLinkedList.Display();
    }
}