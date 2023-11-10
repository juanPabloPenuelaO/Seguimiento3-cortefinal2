package Map;

public class Aviones {
    private String brand;
    private String airline;
    private int capacity;
    private String model;

    public Aviones(String brand, String airline, int capacity, String model) {
        this.brand = brand;
        this.airline = airline;
        this.capacity = capacity;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
