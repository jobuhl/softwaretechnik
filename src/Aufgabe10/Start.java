package Aufgabe10;

import Aufgabe10.Treibstoffsorte;
import Aufgabe10.FahrzeugIntern;

/**
 * Created by Jojo on 07.05.16.
 */
public class Start {

    public static void main(String[] args) {

        //intern
        FahrzeugIntern fahrzeug1 = new FahrzeugIntern(FahrzeugIntern.Treibstoffsorte.Diesel,10);
        System.out.println(fahrzeug1.treibstoffsorte.getName() + " " + fahrzeug1.treibstoffsorte.getOktanzahl());

        //extern
        FahrzeugExtern fahrzeug2 = new FahrzeugExtern(Treibstoffsorte.Normal,10);
        System.out.println(fahrzeug2.treibstoffsorte.getName() + " " + fahrzeug2.treibstoffsorte.getOktanzahl());

    }

}
