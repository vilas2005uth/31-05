class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}