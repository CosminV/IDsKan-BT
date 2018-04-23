package Classes;


public class Document {

    private String name;
    private String surname;
    private String id;
    private String address;
    private boolean isSigned;
    private double latitude;
    private double longitude;

    public Document(String name, String surname, String id, String address, boolean isSigned, double latitude, double longitude){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.address = address;
        this.isSigned = isSigned;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Document() {

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getID() {
        return this.id;
    }

    public void setID(String id){
        this.id = id;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public boolean getIsSigned(){
        return this.isSigned;
    }

    public void setIsSigned(boolean isSigned){
        this.isSigned = isSigned;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
