package Aufgabe6;

/**
 * Created by Jojo on 01.04.16.
 */
public class Scenario {

    public static void main(String[] args) {

        MyInteger a = new MyInteger(1000);


        Integer c = a.hashfunktion();


        Auto car = new Auto(c,"Holla");

        System.out.println(car.fahrgestellnummer);
    }

}
