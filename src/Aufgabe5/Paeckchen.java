package Aufgabe5;

/**
 * Created by Jojo on 18.03.16.
 */
public class Paeckchen {

    private Adresse adresse;
    private Groesse groesse;

    public Paeckchen(Adresse adresse, Groesse groesse) {
        this.adresse = adresse;
        this.groesse = groesse;
    }


    public boolean equals(Object o){

        boolean test = false;

        if (this == o) {
            test = true;
        }


        if (o == null || !(o instanceof Groesse)) {
            test = false;
        }

        Paeckchen a = (Paeckchen) o;

        if (this.groesse.equals(a.groesse) == true ){
            test = true;
        }


        return test;
    }

}