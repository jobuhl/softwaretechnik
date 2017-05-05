package Aufgabe10;

/**
 * Created by Jojo on 07.05.16.
 */
public enum Treibstoffsorte {
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

