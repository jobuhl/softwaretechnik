package Aufgabe21;

/**
 * Created by Jojo on 17.06.16.
 */
public class StartBank {

   public static void main(String[] args) {
        Kunde k1 = new Kunde("Ullrich");
        Kunde k2 = new Kunde("Hans");
        Kunde k3 = new Kunde("Ulli");
        Kunde k4 = new Kunde("Otto");

        Konto ko1 = new Konto(100,k1);
        Konto ko2 = new Konto(50,k2);
        Konto ko3 = new Konto(500,k3);
        Konto ko4 = new Konto(0,k3);
        Konto ko5 = new Konto(100,k1);

        Bank b1 = new Bank("Volksbank","10030");
        Bank b2 = new Bank("Sparkassse","10040");

       b1.kundeAnlegen(k1);
       b1.kundenAusgabe();
       k1.kontoAnlegen(ko1);
       b1.kundenAusgabe();
       k1.kontoAnlegen(ko2);
       b1.kundenAusgabe();

       b1.kundeAnlegen(k2);
       b1.kundenAusgabe();
       k2.kontoAnlegen(ko3);
       b1.kundenAusgabe();
       k2.kontoAnlegen(ko4);
       b1.kundenAusgabe();

       b1.kundeAnlegen(k3);
       b1.kundenAusgabe();

       k1.kontoLoeschen(ko1);
       b1.kundenAusgabe();
    }

}
