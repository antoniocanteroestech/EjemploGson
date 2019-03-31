package softepec.es.ejemplogson;

public class House {

    private String address;
    private int zip;
    private int rooms;

    public House(String address, int zip, int rooms) {
        this.address = address;
        this.zip = zip;
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", zip=" + zip +
                ", rooms=" + rooms +
                '}';
    }
}
