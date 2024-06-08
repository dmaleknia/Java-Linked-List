// Tourist class extends Node to represent a tourist with name, passport number, and destination city
public class Tourist {
    // Name of the tourist
    private String name;
    // Passport number of the tourist
    private int passportNumber;
    // Destination city of the tourist
    private String destinationCity;

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

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the passport number
    public int getPassportNumber() {
        return passportNumber;
    }

    // Setter for the passport number
    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    // Getter for the destination city
    public String getDestinationCity() {
        return destinationCity;
    }

    // Setter for the destination city
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }
}
