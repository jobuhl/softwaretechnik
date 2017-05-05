package Aufgabe10;

/**
 * Created by Jojo on 07.05.16.
 */


/*Überlegung Externe Implementierung
  es muesste eine externe Klasse Treibstoffsorte existieren, welche exakt wie die interne enum Klasse aussieht. um allerdings
  an ihre Werte zukommen müsste sie, falls sie außerhalb des Packetes liegt importiert werden. Die FahrzeugIntern Klasse
*/
//Interne Implementierung
public class FahrzeugIntern {

    Treibstoffsorte treibstoffsorte;
    int treibstoffverbrauch;

    public FahrzeugIntern(Treibstoffsorte treibstoffsorte, int treibstoffverbrauch) {
        this.treibstoffsorte = treibstoffsorte;
        this.treibstoffverbrauch = treibstoffverbrauch;
    }

    //Enum Klasse
    enum Treibstoffsorte {

        Super("Power-Super",100) {
            @Override
            String getName() {
                return name;
            }

            @Override
            int getOktanzahl() {
                return oktanzahl;
            }
        },
        Normal("Turbo-Normal",98) {
            @Override
            String getName() {
                return name;
            }

            @Override
            int getOktanzahl() {
                return oktanzahl;
            }


        },
        Diesel("Renn-Diesel",95) {
            @Override
            String getName() {
                return name;
            }

            @Override
            int getOktanzahl() {
                return oktanzahl;
            }

        };

        //Konstrukor der Enum-Klasse

        String name;
        int oktanzahl;

        Treibstoffsorte(String name,int oktanzahl) {
            this.name = name;
            this.oktanzahl = oktanzahl;
        }

        abstract String getName();
        abstract int getOktanzahl();

    }
}
