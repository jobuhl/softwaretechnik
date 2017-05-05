package Aufgabe20;

/**
 * Created by Jojo on 10.06.16.
 */
public class Auto {

    private String type;
    private String colour;

    public Auto(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (!type.equals(auto.type)) return false;
        return colour.equals(auto.colour);

    }

    @Override
    public int hashCode() {
        int result = 0;

        for (int i = 0; i < type.length() ; i++) {
            result = result + type.charAt(i);
        }

        for (int i = 0; i < colour.length() ; i++) {

            result = result + colour.charAt(i);

        }
        return result%5;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
