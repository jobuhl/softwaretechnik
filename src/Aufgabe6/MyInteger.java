package Aufgabe6;

/**
 * Created by Jojo on 01.04.16.
 */
public class MyInteger {

    private int a;

    public MyInteger(int a) {
        this.a = a;
    }

    public int hashfunktion() {

        return a * 23 % 3;
    }

}
