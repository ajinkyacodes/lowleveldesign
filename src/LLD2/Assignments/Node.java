package LLD2.Assignments;

public class Node {
    // write the code of node class here
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(Node other) {
        this.data = other.data;
        this.next = new Node(other.next.data);
    }
}
