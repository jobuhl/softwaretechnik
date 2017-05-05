package Aufgabe12;

/**
 * Created by Jojo on 08.05.16.
 */
public class Mensch {

    String name;
    int alter;

    public Mensch(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
