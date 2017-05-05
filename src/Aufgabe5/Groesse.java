package Aufgabe5;

/**
 * Created by Jojo on 18.03.16.
 */
public class Groesse {

    private int length;
    private int width;
    private int high;
    private float weight;

    public Groesse(int length, int width, int high, float weight) {
        this.length = length;
        this.width = width;
        this.high = high;
        this.weight = weight;
    }


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHigh() {
        return high;
    }

    public float getWeight() {
        return weight;
    }

    public boolean equals(Object o) {

        boolean test = false;

        if (this == o) {
            test = true;
        }


        if (o == null || !(o instanceof Groesse)) {
            test = false;
        }

        Groesse a = (Groesse) o;

        if (this.getHigh() == a.getHigh() && this.getLength() == a.getLength() && a.getWidth() == a.getWidth() && this.getWeight() == a.getWeight()){
            test = true;
        }


        return test;

    }
}
