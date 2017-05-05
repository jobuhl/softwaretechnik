package Aufgabe21;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Jojo on 15.06.16.
 */
public class Kunde {

    private static int number = 0;

    private String kundennr;
    private String name;

    private Collection<Konto> set = new HashSet<Konto>();

    public Kunde(String name) {

        number++;
        DecimalFormat format = new DecimalFormat("000");

        this.kundennr = format.format(number);
        this.name = name;
    }

    public String getKundennr() {
        return kundennr;
    }

    public String getName() {
        return name;
    }

    public void kontoAnlegen(Konto konto) {

        if (!set.contains(konto)) {
            set.add(konto);

        } else {
            throw new IllegalArgumentException("Konto existiert bereits");
        }
    }

    public void kontoLoeschen(Konto konto) {

        if (set.contains(konto)) {
            set.remove(konto);


        } else {
            throw new IllegalArgumentException("Konto existiert nicht");
        }
    }


    public String toString() {

        return "KundenNr.:" + this.kundennr + " " + " Name: " + this.name;

    }

    public Collection<Konto> getSet() {
        return set;
    }
}
