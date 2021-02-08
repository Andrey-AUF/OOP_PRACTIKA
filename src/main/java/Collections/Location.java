package Collections;

import java.util.Objects;

public class Location {
    private int id;
    private String name;
    private double latitude;
    private double longitude;

    public Location() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || getClass() != object.getClass()) { return false; }
        Location location = (Location) object;
        return id == location.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
