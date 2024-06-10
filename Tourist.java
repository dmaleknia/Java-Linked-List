// Tourist class definition
public class Tourist {
    // Name of the tourist
    private final String name;
    // Passport number of the tourist
    private final int passportNumber;
    // Destination city of the tourist
    private final String destinationCity;

    // Constructor to initialize a Tourist object with name, passport number, and destination city
    public Tourist(String name, int passportNumber, String destinationCity) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.destinationCity = destinationCity;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the passport number
    public int getPassportNumber() {
        return passportNumber;
    }

    // Getter for the destination city
    public String getDestinationCity() {
        return destinationCity;
    }
}