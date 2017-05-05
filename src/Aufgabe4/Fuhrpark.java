package Aufgabe4;

/**
 * Created by Jojo on 18.03.16.
 */
public class Fuhrpark {

    public static void main(String[] args) {

        Fahrer hans = new Fahrer("Hans","ha");
        Fahrer benn = new Fahrer("Benn", "be");

        Auto audi = new Auto(110,"A3",10.0,400);
        Auto bmw = new Auto(10,"X3",60.0,220);

        Auto bmw2 = new Auto(10,"X34",60.0,220);

        System.out.println(bmw.equals(bmw2));

        audi.setDriver(hans);
        bmw.setDriver(benn);

        System.out.println(bmw.equals(bmw2));

    }
}
