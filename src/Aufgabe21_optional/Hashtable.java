package Aufgabe21_optional;

/**
 * Created by Jojo on 18.06.16.
 */
public class Hashtable {

    private java.util.Hashtable<String,Car> hashtable = new java.util.Hashtable();

    public void add(Car car){

        hashtable.put(car.getType(),car);

    }

    public void remove(Car car){

        hashtable.remove(car);

    }
}
