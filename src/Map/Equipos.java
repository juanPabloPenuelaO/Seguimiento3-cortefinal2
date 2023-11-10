package Map;

public class Equipos {
    private String name;
    private String city;
    private int points;

    public Equipos(String name, String city, int points) {
        this.name = name;
        this.city = city;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
