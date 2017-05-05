package Aufgabe4;

/**
 * Created by Jojo on 18.03.16.
 */
public class Fahrer {

    private String name;
    private final String kuerzel;

    public Fahrer(String name, String kuerzel) {
        this.name = name;
        this.kuerzel = kuerzel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKuerzel() {
        return kuerzel;
    }



}
