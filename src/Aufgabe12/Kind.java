package Aufgabe12;

/**
 * Created by Jojo on 08.05.16.
 */
public class Kind extends Mensch {

    public Kind(String name, int alter) {
        super(name, alter);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return this.name + " " + this.alter;
    }
}
