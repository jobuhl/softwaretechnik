package Aufgabe6;

/**
 * Created by Jojo on 01.04.16.
 */
public class Auto {

     int fahrgestellnummer;
     String typ;


    public Auto(int fahrgestellnummer, String typ) {
        this.fahrgestellnummer = fahrgestellnummer;
        this.typ = typ;
    }

    public int hashfunction(){

        int z = 0;

        z = z + fahrgestellnummer*20;

        for (int i = 0; i < typ.length() ; i++) {

            z = z+typ.charAt(i);
        }

        return z % 3;
    }
}
