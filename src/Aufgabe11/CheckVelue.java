package Aufgabe11;


/**
 * Created by Jojo on 07.05.16.
 */
public class CheckVelue {

    //IllegalArgument ist meiner Ansicht nach hier die beste Option da man sofort erkennt das was falsches Eingeben wurde
    public int halbiere(int zahl) {

        if (zahl % 2 != 0) {
            throw new IllegalArgumentException("Wert muss gerade sein");
        } else {

            return (zahl / 2);
        }


    }

    public int halbiereAsserts(int zahl){

        //auf Ereigniss prüfen -> Bei Gegenereignis wird der Fehler geworfen
        assert (zahl % 2 == 0) : "Wert muss gerade sein";

        return zahl/2;
    }

    public static void main(String[] args) {
        CheckVelue velue = new CheckVelue();

        System.out.println(velue.halbiereAsserts(3));

    }

}
