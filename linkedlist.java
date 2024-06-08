public class LinkedList {
    // Head node of the linked list
    private Node head;
    // Size of the linked list
    private int size;

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add a new node to the beginning of the list
    public void addFirst(String name, int passportNumber, String destinationCity) {
        // Create a new Tourist object with the given name, passport number, and destination city
        Tourist tourist = new Tourist(name, passportNumber, destinationCity);
        // Create a new Node object with the Tourist object
        Node newNode = new Node(tourist);
        // Set the next node of the new node to the current head of the list
        newNode.setNext(head);
        // Update the head of the list to the new node
        head = newNode;
        // Increment the size of the list
        size++;
    }

    // Get the size of the linked list
    public int getSize() {
        return size;
    }

    // Find a node in the list by name and return its destination city
    public String findNode(String name) {
        // Start at the head of the list
        Node current = head;
        // Traverse the list until the end is reached
        while (current != null) {
            // Check if the current node's name matches the target name
            if (current.getData().getName().equals(name)) {
                // Return the destination city if a match is found
                return current.getData().getDestinationCity();
            }
            // Move to the next node
            current = current.getNext();
        }
        // If the end of the list is reached without finding a match, print an error message
        System.out.println("Error: " + name + " not found");
        // Return null to indicate that the name was not found
        return null;
    }

    public static void main(String[] args) {
        // Create a new LinkedList object
        LinkedList touristList = new LinkedList();

        // Adding tourists 
        touristList.addFirst("John", 123456, "London");
        touristList.addFirst("Jane", 654321, "Paris");
        touristList.addFirst("Bob", 111111, "New York");

        // Finding tourists 
        System.out.println("Destination of John: " + touristList.findNode("John"));
        System.out.println("Destination of Jane: " + touristList.findNode("Jane"));
        System.out.println("Destination of Bob: " + touristList.findNode("Bob"));

        // Output the size of the linked list
        System.out.println("Size of the linked list: " + touristList.getSize());

        // Adding more tourists
        touristList.addFirst("Alice", 222222, "Tokyo");
        touristList.addFirst("Charlie", 333333, "Sydney");

        // Finding more tourists
        System.out.println("Destination of Alice: " + touristList.findNode("Alice"));
        System.out.println("Destination of Charlie: " + touristList.findNode("Charlie"));

        // Output the size of the linked list
        System.out.println("Size of the linked list: " + touristList.getSize());

        // Fun findNode to attempt to find a tourist that does not exist in the list. 
        System.out.println("Destination of Dave: " + touristList.findNode("Dave"));
    }
}
