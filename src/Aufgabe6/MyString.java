package Aufgabe6;

/**
 * Created by Jojo on 01.04.16.
 */
public class MyString {

    private String a;


    public MyString(String a) {
        this.a = a;
    }

    private int hashFunktion() {

        int b = 0;

        for (int i = 0; i < a.length(); i++) {

            b = b + a.charAt(i);

        }


        return b;
    }


}
