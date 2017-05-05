package Aufgabe5;

/**
 * Created by Jojo on 18.03.16.
 */
public class Adresse {

    private String addressee;
    private String street;
    private int zip;
    private String village;

    public Adresse(String addressee, String street, int zip, String village) {
        this.addressee = addressee;
        this.street = street;
        this.zip = zip;
        this.village = village;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adresse adresse = (Adresse) o;

        if (zip != adresse.zip) return false;
        if (addressee != null ? !addressee.equals(adresse.addressee) : adresse.addressee != null) return false;
        if (street != null ? !street.equals(adresse.street) : adresse.street != null) return false;
        return village != null ? village.equals(adresse.village) : adresse.village == null;

    }
}
