public class LinkedList {
    // Head node of the linked list
    private Node head;
    private int size;

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add a new node to the beginning of the list
    public void addFirst(String name, int passportNumber, String destinationCity) {
        Tourist tourist = new Tourist(name, passportNumber, destinationCity);
        Node newNode = new Node(tourist);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    // Get the size of the linked list
    public int getSize() {
        return size;
    }

    // Find a node in the list by name and return its destination city
    public string findNode (String name) {
        Node current = head;
        while (current != null) {
            if (current.getData().getName().equals(name)) {
                return current.getData().getDestinationCity();
            }
            current = current.getNext();
        }
        return null;
    }
}

public statis void main (String[] args) {

    // Create a new LinkedList object
    LinkedList touristList = new LinkedList();

    // Adding tourists 
    touristList.addFirst("John", 123456, "London");
    touristList.addFirst("Jane", 654321, "Paris");
    touristList.addFirst("Bob", 111111, "New York");

    // Finding tourists 
    System.out.println("Destiation of John: " + touristList.findNode("John"));
    System.out.println("Destiation of Jane: " + touristList.findNode("Jane"));
    System.out.println("Destiation of Bob: " + touristList.findNode("Bob"));

    // Output the size of the linked list
    System.out.println("Size of the linked list: " + touristList.getSize());

    // Adding more tourists
    touristList.addFirst("Alice", 222222, "Tokyo");
    touristList.addFirst("Charlie", 333333, "Sydney");

    // Finding more tourists
    System.out.println("Destiation of Alice: " + touristList.findNode("Alice"));
    System.out.println("Destiation of Charlie: " + touristList.findNode("Charlie"));

    // Output the size of the linked list
    System.out.println("Size of the linked list: " + touristList.getSize());
}
