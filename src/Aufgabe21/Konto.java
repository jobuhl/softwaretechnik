package Aufgabe21;

import java.text.DecimalFormat;

/**
 * Created by Jojo on 15.06.16.
 */
public class Konto {

    private static int number=0;

    private String kontonr;
    private double betrag;
    private Kunde kunde;

    public Konto(double betrag, Kunde kunde) {

        number++;
        DecimalFormat format = new DecimalFormat("0000000000");

        this.kontonr = format.format(number);
        this.betrag = betrag;
        this.kunde = kunde;
    }

    public String getKontonr() {
        return kontonr;
    }

    public double getBetrag() {
        return betrag;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public void geldUeberweisen(Konto konto, double betrag){

        konto.setBetrag(konto.getBetrag() + betrag);
        this.betrag = this.betrag - betrag;

    }

    public String toString(){

        return "KontoNr.: " + this.kontonr + " Guthaben: " + this.betrag;

    }
}
