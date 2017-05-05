package Aufgabe13;

/**
 * Created by Jojo on 07.05.16.
 */
public class Studentin {



    @SqlAttribute(persist = true, sqlType = SQLType.INTEGER, columnname = "matrikelnr.")
    private int matrikelnummer;

    @SqlAttribute(persist = true, sqlType = SQLType.VARCHAR, columnname = "name")
    private String name;

    public Studentin(String name, int matrikelnummer) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }
}
