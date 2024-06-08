public class Main {
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