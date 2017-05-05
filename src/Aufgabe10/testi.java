package Aufgabe10;

/**
 * Created by Jojo on 04.07.16.
 */
public class testi {

    public  static int a;
    Treibi treibi;

    public testi(Treibi treibi) {
        this.treibi = treibi;
    }

    public Treibi getTreibi() {
        return treibi;
    }


    public static void main(String[] args) {
        testi a = new testi(Treibi.Diesel);


        System.out.println((10%2 == 0));

    }
}
