package Aufgabe21_optional;

/**
 * Created by Jojo on 18.06.16.
 */
public class Car {

    private String type;
    private String farbe;

    public Car(String type, String farbe) {
        this.type = type;
        this.farbe = farbe;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (type != null ? !type.equals(car.type) : car.type != null) return false;
        return farbe != null ? farbe.equals(car.farbe) : car.farbe == null;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (farbe != null ? farbe.hashCode() : 0);
        return result;
    }
}

