// Node class definition
public class Node {
    // Data stored in the node
    private int data;
    // Reference to the next node in the list
    private Node next;

    // Constructor to initialize a new node with data
    public Node(Tourist data) {
        this.data = data;
        this.next = null;
    }

    // Getter for the data
    public Tourist getData() {
        return data;
    }

    // Setter for the data
    public void setData(Tourist data) {
        this.data = data;
    }

    // Getter for the next node
    public Node getNext() {
        return next;
    }

    // Setter for the next node
    public void setNext(Node next) {
        this.next = next;
    }
}