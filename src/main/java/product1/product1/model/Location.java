package product1.product1.model;

public class Location {
    private String city;
    private long zipcode;
    private String street;
    private int port;

    public Location (String city, long zipcode, String street, int port){
        this.city =city;
        this.zipcode =zipcode;
        this.street =street;
        this.port =port;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", zipcode=" + zipcode +
                ", street='" + street + '\'' +
                ", port=" + port +
                '}';
    }
}
